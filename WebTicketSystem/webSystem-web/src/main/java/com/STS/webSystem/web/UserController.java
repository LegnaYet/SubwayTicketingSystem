package com.STS.webSystem.web;

import com.STS.webSystem.pojo.po.User;
import com.STS.webSystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(User user, HttpSession session) {
        User loginUser = service.login(user);
        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            return "success";
        }
        return "faild";
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String register(User user) {
        user.setBalance(0.0);
        service.insertUser(user);
        return "page/login/login";
    }

    @RequestMapping(value = "/loginout", method = RequestMethod.GET)
    public String loginout(HttpSession session) {
        session.removeAttribute("user");
        return "page/login/login";
    }


    @RequestMapping(value = "/checkUsername", method = RequestMethod.POST)
    @ResponseBody
    public String checkUsername(User user, HttpSession session) {
        User loginUser = service.login(user);
        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            return "success";
        }
        return "faild";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(User user,HttpSession session){
        int i = 0;
        try {
            i = service.alterUser(user);
            User loginUser = service.selectUser(user.getUsername());
            session.removeAttribute("user");
            session.setAttribute("user",loginUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/main";
    }


}
