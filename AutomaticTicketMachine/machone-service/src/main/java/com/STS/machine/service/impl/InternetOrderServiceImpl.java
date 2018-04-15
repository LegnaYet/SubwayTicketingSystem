package com.STS.machine.service.impl;

import com.STS.machine.dao.InternetOrderMapper;
import com.STS.machine.pojo.po.InternetOrder;
import com.STS.machine.pojo.po.InternetOrderExample;
import com.STS.machine.service.IInternetOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InternetOrderServiceImpl implements IInternetOrderService{

    @Autowired
    private InternetOrderMapper dao;

    @Override
    public InternetOrder getTic(String telephone, String verificationcode) {
        InternetOrderExample example = new InternetOrderExample();
        InternetOrderExample.Criteria criteria = example.createCriteria();
        criteria.andTelephoneEqualTo(telephone);
        criteria.andVerificationcodeEqualTo(verificationcode);
        criteria.andStateEqualTo("1");
        List<InternetOrder> internetOrders = dao.selectByExample(example);
        return internetOrders.get(0);
    }
}
