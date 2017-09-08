package com.xianyo.loginmodule.service.implement;

import com.xianyo.loginmodule.dao.mapper.UserDataExample;
import com.xianyo.loginmodule.dao.mapper.UserDataMapper;
import com.xianyo.loginmodule.dao.pojo.UserData;
import com.xianyo.loginmodule.service.RegisterService;
import com.xianyo.util.service.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Random;

@Service
public class RegisterServiceImplement implements RegisterService {

    @Autowired
    UserDataMapper userDataMapper;
    @Autowired
    PostmanService postman;

    /**
     * 对外的登录接口，处理用户注册的唯一接口
     *
     * @param user 需要注册的用户信息
     * @return 是否注册成功
     */
    public boolean Register(UserData user) {
        if (CanRegister(user)) {    //判断是否可以注册
            postman.SendEmail(user.getEmail());
            InitUser(user);
            return true;
        }
        return false;
    }

    /**
     * 判断用户是否已被注册
     *
     * @param user 需要查找的用户
     * @return 如果被注册返回false
     * 如果未被注册返回true
     */
    private boolean CanRegister(UserData user) {
        List<UserData> users;
        UserDataExample example = new UserDataExample();

        UserDataExample.Criteria criteria;
        //判断用户名是否被注册
        example.setDistinct(true); //重复查询 = example.createCriteria();//构造自定义查询条件
        criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        users = userDataMapper.selectByExample(example);
        if (users.size() == 0) {
            //如果用户名没有被注册
            //判断邮箱是否被注册
            users.clear();
            example.clear();
            example.setDistinct(true);//重复查询
            criteria = example.createCriteria();//构造自定义查询条件
            criteria.andEmailEqualTo(user.getEmail());
            users = userDataMapper.selectByExample(example);
            if (users.size() == 0) {
                //如果邮箱没有被注册
                //判断手机号是否被注册
                users.clear();
                example.clear();

                example.setDistinct(true);//重复查询
                criteria = example.createCriteria();//构造自定义查询条件
                criteria.andPhonenumberEqualTo(user.getPhonenumber());
                users = userDataMapper.selectByExample(example);
                if (users.size() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 初始化一些用户参数并将用户信息插入数据库中
     *
     * @param user
     */
    private void InitUser(UserData user) {
        user.init();
        user.setUserid(UserIDCreator());
        userDataMapper.insert(user);
    }

    /**
     * @return 返回userid
     * 生成UserID
     */
    private Long UserIDCreator() {
        Random randomCreator = new Random();
        UserData tampUser;
        long userid;
        do {
            userid = randomCreator.nextLong();
            userid = (userid > 0) ? userid : -userid;
            tampUser = userDataMapper.selectByPrimaryKey(userid);
        } while (tampUser != null);
        return userid;
    }
}