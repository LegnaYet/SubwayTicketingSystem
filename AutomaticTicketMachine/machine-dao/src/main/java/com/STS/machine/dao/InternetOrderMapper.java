package com.STS.machine.dao;

import com.STS.machine.pojo.po.InternetOrder;
import com.STS.machine.pojo.po.InternetOrderExample;
import com.STS.machine.pojo.po.InternetOrderKey;
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