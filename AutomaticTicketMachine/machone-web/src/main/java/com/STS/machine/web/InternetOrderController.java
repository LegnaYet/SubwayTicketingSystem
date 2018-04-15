package com.STS.machine.web;

import com.STS.machine.pojo.po.InternetOrder;
import com.STS.machine.pojo.po.Order;
import com.STS.machine.pojo.po.Platform;
import com.STS.machine.service.IInternetOrderService;
import com.STS.machine.service.IPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class InternetOrderController {
    @Autowired
    private IInternetOrderService service;

    @RequestMapping(value = "/toGetTic",method = RequestMethod.POST)
    public  String chooseNum(@RequestParam("telephone") String telephone,@RequestParam("verificationcode") String verificationcode, HttpServletRequest request){
        InternetOrder internetOrder = service.getTic(telephone, verificationcode);
        request.setAttribute("internetOrder",internetOrder);
        return "internetOrderInfo";
    }

}
