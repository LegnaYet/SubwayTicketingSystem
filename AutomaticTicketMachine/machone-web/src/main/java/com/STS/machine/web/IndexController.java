package com.STS.machine.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String toIndex(){
        return "index";
    }
    @RequestMapping(value = "/toBuy",method = RequestMethod.GET)
    public  String toBuy(){
        return "buyTic";
    }
    @RequestMapping(value = "/toGet",method = RequestMethod.GET)
    public  String toGet(){
        return "getTic";
    }

    @RequestMapping(value = "/chooseNum",method = RequestMethod.GET)
    public  String chooseNum(){
        return "chooseNum";
    }

}
