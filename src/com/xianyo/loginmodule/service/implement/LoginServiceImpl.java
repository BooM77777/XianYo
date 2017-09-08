package com.xianyo.loginmodule.service.implement;

import com.xianyo.loginmodule.dao.mapper.UserDataExample;
import com.xianyo.loginmodule.dao.mapper.UserDataMapper;
import com.xianyo.loginmodule.dao.pojo.LoginData;
import com.xianyo.loginmodule.dao.pojo.UserData;
import com.xianyo.loginmodule.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 实现用户登录的操作
 */
@Service
public class LoginServiceImpl
        implements LoginService {
    @Autowired
    UserDataMapper userDataMapper;

    public UserData Login(LoginData user) {
        return CanLogin(user);
    }

    /**
     * 判断用户是否可以登录
     *
     * @param user 登录用户信息
     * @return 如果可以登录返回true
     * 如果不能登陆返回false
     */
    private UserData CanLogin(LoginData user) {
        UserData tempData;
        UserDataExample example = new UserDataExample();
        //判断是否可能是一个邮箱地址
        // 如果是，使用邮箱地址判断能否登录
        // 否则跳过判断
        if (CanBeEmailAddress(user.getUsername())) {
            tempData = FindByEmailAdress(example, user.getUsername(), user.getPassword());
            if (tempData != null)
                return tempData;
        }
        //判断是否可能是一个手机号码
        // 如果是，使用手机号码判断能否登录
        // 否则跳过判断
        if (CanBePhonenumber(user.getUsername())) {
            tempData = FindByPhonenumber(example, user.getUsername(), user.getPassword());
            if (tempData != null)
                return tempData;
        }
        //使用用户名判断能否登录
        tempData = FindByUsername(example, user.getUsername(), user.getPassword());
        return tempData;
    }

    /**
     * 以邮箱为依据查找
     *
     * @param example  用于条件查询
     * @param email    邮箱地址
     * @param password 密码
     * @return 返回是否可以登录
     */
    private UserData FindByEmailAdress(UserDataExample example,
                                       String email, String password) {
        //会用到的变量的定义和初始化
        example.clear();
        example.setDistinct(false);          //重复查询
        UserDataExample.Criteria criteria
                = example.createCriteria(); //构造自定义查询条件
        criteria.andEmailEqualTo(email);
        criteria.andPasswordEqualTo(password);
        List<UserData> users = userDataMapper.selectByExample(example);
        //判断是否查找到了唯一一个账户
        // 如果是，返回
        // 如果不是，返回空
        if (users.size() == 1)
            return users.get(0);
        else
            return null;
    }

    /**
     * 以电话号码为依据查找
     *
     * @param example     用于条件查询
     * @param phonenumber 电话号码
     * @param password    密码
     * @return 返回是否可以登录
     */
    private UserData FindByPhonenumber(UserDataExample example,
                                       String phonenumber, String password) {
        //会用到的变量的定义和初始化
        example.clear();
        example.setDistinct(false);                     //重复查询
        UserDataExample.Criteria criteria = example.createCriteria(); //构造自定义查询条件
        criteria.andPhonenumberEqualTo(phonenumber);
        criteria.andPasswordEqualTo(password);
        List<UserData> users = userDataMapper.selectByExample(example);
        //判断是否查找到了唯一一个账户
        // 如果是，返回
        // 如果不是，返回空
        if (users.size() == 1)
            return users.get(0);
        else
            return null;
    }

    /**
     * 通过用户名查找是否可以登录
     *
     * @param example  用于条件查询
     * @param username 用户名
     * @param password 密码
     * @return 返回是否可以登录
     */
    private UserData FindByUsername(UserDataExample example,
                                    String username, String password) {
        //会用到的变量的定义和初始化
        example.clear();
        example.setDistinct(false);                     //重复查询
        UserDataExample.Criteria criteria = example.createCriteria(); //构造自定义查询条件
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<UserData> users = userDataMapper.selectByExample(example);
        //判断是否查找到了唯一一个账户
        // 如果是，返回
        // 如果不是，返回空
        if (users.size() == 1)
            return users.get(0);
        else
            return null;
    }

    /**
     * 判断是否可能为邮箱地址
     * 使用*@*的正则表达式匹配
     *
     * @param email
     * @return
     */
    private boolean CanBeEmailAddress(String email) {
        // 邮箱验证规则
        String regEx =
                "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]" +
                        "@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        // 编译正则表达式
        // 忽略大小写
        Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pat.matcher(email);
        // 字符串是否与正则表达式相匹配
        return matcher.matches();
    }

    /**
     * 判断是否是一个电话号码
     *
     * @param phonenumber 传入的字符串
     * @return 如果为电话号码返回true
     * 如果不为电话号码返回false
     */
    private boolean CanBePhonenumber(String phonenumber) {
        // 邮箱验证规则
        String regEx =
                "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        // 编译正则表达式
        // 忽略大小写
        Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pat.matcher(phonenumber);
        // 字符串是否与正则表达式相匹配
        return matcher.matches();
    }
}