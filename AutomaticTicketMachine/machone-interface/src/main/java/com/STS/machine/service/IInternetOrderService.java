package com.STS.machine.service;

import com.STS.machine.pojo.po.InternetOrder;

public interface IInternetOrderService {
    InternetOrder getTic(String telephone ,String verificationcode);
}
