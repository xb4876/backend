package com.renwu.backend.demo.controller;

import com.renwu.backend.demo.model.Response;
import com.renwu.backend.demo.model.User;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    protected Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        System.out.println("Come On Hello World!");
        String str = "Hello";
        return str+"Hello !";
    }

    //跳转页面
    @GetMapping("/toLogin")
    public ModelAndView toLogin(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }

    //跳转注册
    @GetMapping("/toRegister")
    public ModelAndView toRegister(ModelAndView modelAndView){
        modelAndView.addObject("loginName", "admin");
        modelAndView.addObject("loginId", "27");
        modelAndView.setViewName("register");
        System.out.println(modelAndView.toString());
        return modelAndView;
    }

    //登录接口，用于测试
    @ApiOperation(notes = "", httpMethod = "POST", value = "登录")
    @RequestMapping("/login")
    public Response login(User user){
        logger.info("login,"+ user.toString());
        return new Response().success("登录成功！！！");
    }
}