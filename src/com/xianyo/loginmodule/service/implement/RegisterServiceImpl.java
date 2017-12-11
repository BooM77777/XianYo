package com.xianyo.loginmodule.service.implement;

import com.xianyo.loginmodule.dao.mapper.UserDataExample;
import com.xianyo.loginmodule.dao.mapper.UserDataMapper;
import com.xianyo.loginmodule.dao.pojo.UserData;
import com.xianyo.loginmodule.service.RegisterService;
import com.xianyo.util.service.IDGeneratorService;
import com.xianyo.util.service.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserDataMapper userDataMapper;
    @Autowired
    PostmanService postman;
    @Autowired
    IDGeneratorService idGeneratorService;

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

    @Override
    public boolean CheckUsername(String username) {
        List<UserData> users;
        UserDataExample example = new UserDataExample();
        UserDataExample.Criteria criteria = example.createCriteria();
        example.setDistinct(false);
        criteria.andUsernameEqualTo(username);
        users = userDataMapper.selectByExample(example);
        if (users.size()==0||users==null){
            return true;
        }else
            return false;
    }
    @Override
    public boolean CheckPhoneNumber(String phonenumber) {
        List<UserData> users;
        UserDataExample example = new UserDataExample();
        UserDataExample.Criteria criteria = example.createCriteria();
        example.setDistinct(false);
        criteria.andPhonenumberEqualTo(phonenumber);
        users = userDataMapper.selectByExample(example);
        if (users.size()==0||users==null){
            return true;// available
        }else
            return false;
    }
    @Override
    public boolean CheckEmail(String email) {
        List<UserData> users;
        UserDataExample example = new UserDataExample();
        UserDataExample.Criteria criteria = example.createCriteria();
        example.setDistinct(false);
        criteria.andEmailEqualTo(email);
        users = userDataMapper.selectByExample(example);
        if (users.size()==0||users==null){
            return true;
        }else
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
        if (CheckEmail(user.getEmail())
                &&CheckPhoneNumber(user.getPhonenumber())
                &&CheckUsername(user.getUsername()))
            return true;
        else
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
        Long randomCreator = idGeneratorService.genetatorForOthers(1);
        UserData tampUser;
        long userid;
        do {
            userid = randomCreator;
            userid = (userid > 0) ? userid : -userid;
            tampUser = userDataMapper.selectByPrimaryKey(userid);
        } while (tampUser != null);
        return userid;
    }
}