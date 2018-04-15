package com.STS.webSystem.service;

import com.STS.webSystem.pojo.po.User;

public interface IUserService {
    int insertUser(User user);

    User login(User user);

    int alterUser(User user);

    int changePWD(User user);

    User selectUser(String username);
}
