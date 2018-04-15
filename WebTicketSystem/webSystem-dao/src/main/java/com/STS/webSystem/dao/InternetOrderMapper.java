package com.STS.webSystem.dao;

import com.STS.webSystem.pojo.po.InternetOrder;
import com.STS.webSystem.pojo.po.InternetOrderExample;
import com.STS.webSystem.pojo.po.InternetOrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternetOrderMapper {
    int countByExample(InternetOrderExample example);

    int deleteByExample(InternetOrderExample example);

    int deleteByPrimaryKey(InternetOrderKey key);

    int insert(InternetOrder record);

    int insertSelective(InternetOrder record);

    List<InternetOrder> selectByExample(InternetOrderExample example);

    InternetOrder selectByPrimaryKey(InternetOrderKey key);

    int updateByExampleSelective(@Param("record") InternetOrder record, @Param("example") InternetOrderExample example);

    int updateByExample(@Param("record") InternetOrder record, @Param("example") InternetOrderExample example);

    int updateByPrimaryKeySelective(InternetOrder record);

    int updateByPrimaryKey(InternetOrder record);
}