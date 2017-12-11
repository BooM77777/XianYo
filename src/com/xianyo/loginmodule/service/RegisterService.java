package com.xianyo.loginmodule.service;

import com.xianyo.loginmodule.dao.pojo.UserData;

public interface RegisterService {
    boolean Register(UserData user);
    boolean CheckUsername(String username);
    boolean CheckEmail(String mail);
    boolean CheckPhoneNumber(String phonenumber);
}
