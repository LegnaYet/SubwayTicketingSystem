package com.STS.webSystem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String toLogin(){
        return "page/login/login";
    }

    @RequestMapping(value = "/toIndex",method = RequestMethod.GET)
    public  String toIndex(){
        return "Bindex";
    }



    @RequestMapping(value = "/page/main",method = RequestMethod.GET)
    public  String toMain(){
        return "page/main";
    }

    @RequestMapping(value = "/page/{forword1}/{forword2}",method = RequestMethod.GET)
    public  String toPage(@PathVariable("forword1") String forward1,@PathVariable("forword2") String forword2){
        return "page/"+forward1+"/"+forword2;
    }
}
