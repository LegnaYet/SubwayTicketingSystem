package com.STS.webSystem.dao;


import com.STS.webSystem.pojo.po.User;

public interface UserMapper {

    User login(User user);

    User selectUserByUsername(String username);

    int updateByPrimaryKeySelective(User user);

    int insert(User user);

}
