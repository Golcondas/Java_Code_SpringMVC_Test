package com.myspring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

@Controller
public class TestController{
    @RequestMapping(value = "/test/admin")
    @ResponseBody
    public ModelAndView testSpring(){
        List<String> list=new LinkedList<String>();
        list.add("小王");
        list.add("小张");

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name",list);
        modelAndView.setViewName("WEB-INF/jsp/items/itemslist.jsp");
        return modelAndView;
    }
}
