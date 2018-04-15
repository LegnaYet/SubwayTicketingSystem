package com.STS.webSystem.service.impl;

import com.STS.webSystem.dao.InternetOrderCustomMapper;
import com.STS.webSystem.dao.InternetOrderMapper;
import com.STS.webSystem.pojo.dto.MessageResult;
import com.STS.webSystem.pojo.dto.Page;
import com.STS.webSystem.pojo.po.InternetOrder;
import com.STS.webSystem.pojo.po.InternetOrderExample;
import com.STS.webSystem.pojo.po.InternetOrderKey;
import com.STS.webSystem.pojo.vo.OrderQuery;
import com.STS.webSystem.service.IInternetOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InternetOrderServiceImpl implements IInternetOrderService {

    @Autowired
    private InternetOrderMapper dao;

    @Autowired
    private InternetOrderCustomMapper customDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public InternetOrder getTic(String telephone, String verificationcode) {
//        InternetOrderExample example = new InternetOrderExample();
//        InternetOrderExample.Criteria criteria = example.createCriteria();
//        criteria.andTelephoneEqualTo(telephone);
//        criteria.andVerificationcodeEqualTo(verificationcode);
//        criteria.andStateEqualTo("1");
//        List<InternetOrder> internetOrders = dao.selectByExample(example);
        return null;
    }

    @Override
    public int insert(InternetOrder internetOrder) {
        return dao.insert(internetOrder);
    }

    @Override
    public MessageResult<InternetOrder> selectByPage(Page page, OrderQuery query) {
        MessageResult<InternetOrder> result = new MessageResult<>();
        try {
            List<InternetOrder> customList = customDao.selectByPage(page,query);
            result.setCode(0);
            result.setCount(countOrders(query));
            result.setMsg("success");
            result.setData(customList);
        } catch (Exception e) {
            logger.debug(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    @Transactional
    public int updateState(String oid, String state) {
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.setOid(oid);
        internetOrder.setState(state);
        return dao.updateByPrimaryKeySelective(internetOrder);
    }

    @Override
    public InternetOrder selectByOid(String oid) {
        InternetOrderKey key = new InternetOrderKey();
        key.setOid(oid);
        return dao.selectByPrimaryKey(key);
    }

    @Override
    public long countOrders(OrderQuery query) {
        return customDao.countOrders(query);
    }
}
