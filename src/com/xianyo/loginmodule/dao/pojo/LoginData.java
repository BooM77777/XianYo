package com.xianyo.loginmodule.dao.pojo;

/**
 * 用于用户登录的信息记录
 */
public class LoginData {

    private String username;
    private String password;
    private boolean isAdmin;
    private boolean sessionflag;

    public boolean isSessionflag() {
        return sessionflag;
    }

    public void setSessionflag(boolean sessionflag) {
        this.sessionflag = sessionflag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
    @Override
    public String toString(){
        return username+" , "+password;
    }
}