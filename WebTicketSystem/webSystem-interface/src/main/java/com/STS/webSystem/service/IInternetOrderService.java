package com.STS.webSystem.service;


import com.STS.webSystem.pojo.dto.MessageResult;
import com.STS.webSystem.pojo.dto.Page;
import com.STS.webSystem.pojo.po.InternetOrder;
import com.STS.webSystem.pojo.vo.OrderQuery;

public interface IInternetOrderService {
    InternetOrder getTic(String telephone, String verificationcode);

    int insert(InternetOrder internetOrder);

    long countOrders(OrderQuery query);

    MessageResult<InternetOrder> selectByPage(Page page, OrderQuery query);

    int updateState(String oid, String state);

    InternetOrder selectByOid(String oid);
}
