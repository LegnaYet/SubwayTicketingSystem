package com.STS.machine.web;

import com.STS.machine.pojo.po.Order;
import com.STS.machine.pojo.po.Platform;
import com.STS.machine.service.IPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OrderController {
    @Autowired
    private IPlatformService platformService;

    @RequestMapping(value = "/orderTic",method = RequestMethod.POST)
    public  String chooseNum(Order order, HttpServletRequest request){
        Platform beginPlatform = platformService.selectPlatformByPid(order.getBeginid());
        Platform endPlatform = platformService.selectPlatformByPid(order.getEndid());
        order.setBeginname(beginPlatform.getPname());
        order.setEndname(endPlatform.getPname());

        int beginId = order.getBeginid();
        int endId = order.getEndid();
        if (beginId > 100){
            beginId /= 10;
        }
        if (endId > 100){
            endId /= 10;
        }
        int platforms = Math.abs(beginId - endId) ;
        if (platforms <= 2){
            order.setPrice(order.getTicnum()*2.0);
        }else{
            int times = (platforms-2)/2;
            order.setPrice(order.getTicnum()*(times*1.0+2));
        }

        request.setAttribute("order",order);

        return "payOrder";
    }

    @RequestMapping(value = "/toPay",method = RequestMethod.POST)
    public  String chooseNum(@RequestParam("payWay") String payWay,@RequestParam("price") double price,HttpServletRequest request){
        request.setAttribute("price",price);
        if ("wechat".equals(payWay)){
            return "wechatPay";
        }
        if ("aliPay".equals(payWay)){
            return "aliPay";
        }if ("cash".equals(payWay)){
            return "cashPay";
        }
        return null;
    }
}
