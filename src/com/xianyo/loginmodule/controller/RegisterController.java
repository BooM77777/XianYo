package com.xianyo.loginmodule.controller;

import com.xianyo.loginmodule.dao.pojo.UserData;
import com.xianyo.loginmodule.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @RequestMapping("user.register")
    public ModelAndView UserRegister(UserData userData) {
        ModelAndView mav = new ModelAndView("loginjsp/userlogin");
        if (registerService.Register(userData)) {
            mav.addObject("registerMessage","注册成功");
        } else {
            mav.addObject("registerMessage","注册失败，该帐目已被注册");
        }
        return mav;
    }
}