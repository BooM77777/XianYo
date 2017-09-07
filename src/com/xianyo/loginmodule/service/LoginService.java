package com.xianyo.loginmodule.service;

import com.xianyo.loginmodule.dao.pojo.LoginData;
import com.xianyo.loginmodule.dao.pojo.UserData;

public interface LoginService {
    UserData Login(LoginData userdata);
}
