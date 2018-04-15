package com.STS.webSystem.service.impl;

import com.STS.webSystem.dao.UserMapper;
import com.STS.webSystem.pojo.po.User;
import com.STS.webSystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper dao;

    @Transactional
    @Override
    public int insertUser(User user) {
        return dao.insert(user);
    }

    @Override
    public User login(User user) {
        return dao.login(user);
    }

    @Override
    @Transactional
    public int alterUser(User user) {
        return dao.updateByPrimaryKeySelective(user);
    }

    @Override
    @Transactional
    public int changePWD(User user) {
        return dao.updateByPrimaryKeySelective(user);
    }

    @Override
    public User selectUser(String username) {
        return dao.selectUserByUsername(username);
    }
}
