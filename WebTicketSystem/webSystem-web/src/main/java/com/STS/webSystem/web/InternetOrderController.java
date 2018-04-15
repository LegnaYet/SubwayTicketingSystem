package com.STS.webSystem.web;

import com.STS.machine.util.IdUtils;
import com.STS.machine.util.RandomPassword;
import com.STS.webSystem.pojo.dto.MessageResult;
import com.STS.webSystem.pojo.dto.Page;
import com.STS.webSystem.pojo.po.InternetOrder;
import com.STS.webSystem.pojo.po.Platform;
import com.STS.webSystem.pojo.po.User;
import com.STS.webSystem.pojo.vo.OrderQuery;
import com.STS.webSystem.service.IInternetOrderService;
import com.STS.webSystem.service.IPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class InternetOrderController {
    @Autowired
    private IPlatformService platformService;

    @Autowired
    private IInternetOrderService service;

    @RequestMapping(value = "/orderTic",method = RequestMethod.POST)
    public  String orderTic(InternetOrder internetOrder, HttpServletRequest request, HttpSession session){
        Platform beginPlatform = platformService.selectPlatformByPid(internetOrder.getBeginid());
        Platform endPlatform = platformService.selectPlatformByPid(internetOrder.getEndid());
        internetOrder.setBeginname(beginPlatform.getPname());
        internetOrder.setEndname(endPlatform.getPname());

        User user = (User) session.getAttribute("user");
        internetOrder.setTelephone(user.getTelephone());

        internetOrder.setVerificationcode(RandomPassword.getRandomString(6));

        internetOrder.setState("0");

        internetOrder.setOid(IdUtils.getUUID());

        int beginId = internetOrder.getBeginid();
        int endId = internetOrder.getEndid();
        if (beginId > 100){
            beginId /= 10;
        }
        if (endId > 100){
            endId /= 10;
        }
        int platforms = Math.abs(beginId - endId) ;
        if (platforms <= 2){
            internetOrder.setPrice(internetOrder.getTicnum()*2.0);
        }else{
            int times = (platforms-2)/2;
            internetOrder.setPrice(internetOrder.getTicnum()*(times*1.0+2));
        }

        int i = service.insert(internetOrder);

        request.setAttribute("internetOrder",internetOrder);

        return "page/order/payOrder";
    }

    @RequestMapping(value = "/toPay",method = RequestMethod.POST)
    public  String chooseNum(@RequestParam("payWay") String payWay,@RequestParam("oid") String oid,@RequestParam("price") double price,HttpServletRequest request){
        request.setAttribute("price",price);
        request.setAttribute("oid",oid);
        if ("wechat".equals(payWay)){
            return "page/pay/wechat";
        }
        if ("aliPay".equals(payWay)){
            return "page/pay/alipay";
        }
        return null;
    }

    @RequestMapping(value = "/paid",method = RequestMethod.POST)
    public  String paid(@RequestParam("oid") String oid,HttpServletRequest request){
        int i = service.updateState(oid,"1");
        InternetOrder internetOrder = service.selectByOid(oid);
        request.setAttribute("internetOrder",internetOrder);
        return "page/order/orderInfo";
    }


    @ResponseBody
    @RequestMapping(value = "/orderList",method = RequestMethod.GET)
    public MessageResult<InternetOrder> queryOrder(Page page, OrderQuery query,HttpSession session){
        MessageResult<InternetOrder> result = null;
        User user = (User) session.getAttribute("user");
        try {
            System.out.println(query.getState());
            query.setTelephone(user.getTelephone());
            result = service.selectByPage(page,query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
