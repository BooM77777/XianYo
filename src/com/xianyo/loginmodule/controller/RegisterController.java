package com.xianyo.loginmodule.controller;

import com.xianyo.loginmodule.dao.pojo.UserData;
import com.xianyo.loginmodule.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @RequestMapping(value = "/user.register", method = RequestMethod.POST)
    public ModelAndView UserRegister(UserData userData,
                                     HttpServletRequest request,
                                     HttpServletResponse response) {
        boolean sessionflag = userData.isSessionflag();
        System.out.println("sessionflag: "+sessionflag);
        ModelAndView mav = new ModelAndView("loginjsp/login/userlogin");
        if (registerService.Register(userData)) {
            if (sessionflag) {
                //存入cookie
                //创建cookie并写入response
                //将用户名和密码保存在cookie中传出
                //使用cookie的便利也放置手机和邮箱的泄露
                Cookie usernameCookie = new Cookie("username", userData.getUsername());
                usernameCookie.setMaxAge(7 * 24 * 3600);
                usernameCookie.setPath("/");//设置作用域
                response.addCookie(usernameCookie);
                Cookie passwordCookie = new Cookie("password", userData.getPassword());
                passwordCookie.setMaxAge(7 * 24 * 3600);
                passwordCookie.setPath("/");//设置作用域
                response.addCookie(passwordCookie);
                mav.addObject("registerMessage", "注册成功,下次自动登陆");
            } else {
                mav.addObject("registerMessage", "注册成功,下次还得手动登陆");
            }
        } else {
            mav.addObject("registerMessage", "注册失败");
        }
        return mav;
    }

    @RequestMapping(value = "checkusername.register", method = RequestMethod.POST)
    @ResponseBody
    public String CheckUserName(@RequestBody String username) {
        System.out.println(username);
        if (registerService.CheckUsername(username)) {
            return "username is available";
        } else
            return "username have already been registered";
    }

    @RequestMapping(value = "checkmail.register", method = RequestMethod.POST)
    @ResponseBody
    public String CheckMail(@RequestBody String mail) {
        System.out.println(mail);
        if (registerService.CheckEmail(mail)) {
            return "your mail is available";
        } else
            return "your mail have already been registered";
    }

    @RequestMapping(value = "checkphonenumber.register", method = RequestMethod.POST)
    @ResponseBody
    public String CheckPhoneNumber(@RequestBody String phonenumber) {
        System.out.println(phonenumber);
        if (registerService.CheckPhoneNumber(phonenumber)) {
            return "phonenumber is available";
        } else
            return "phonenumber have already been registered";
    }

//    @RequestMapping(value = "checksessionflag.register")
//    public boolean CheckSession(@RequestBody boolean session) {
//        if (session) return true;
//        else return false;
//    }
}