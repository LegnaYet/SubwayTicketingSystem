package com.STS.webSystem.dao;

import com.STS.webSystem.pojo.dto.Page;
import com.STS.webSystem.pojo.po.InternetOrder;
import com.STS.webSystem.pojo.vo.OrderQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InternetOrderCustomMapper {
    List<InternetOrder> selectByPage(@Param("page") Page page, @Param("query") OrderQuery query);

    long countOrders(@Param("query") OrderQuery query);
}