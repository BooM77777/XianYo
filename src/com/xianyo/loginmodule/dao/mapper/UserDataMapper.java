package com.xianyo.loginmodule.dao.mapper;

import java.util.List;

import com.xianyo.loginmodule.dao.pojo.UserData;
import org.apache.ibatis.annotations.Param;

public interface UserDataMapper {
    int countByExample(UserDataExample example);

    int deleteByExample(UserDataExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(UserData record);

    int insertSelective(UserData record);
    List<UserData> selectAll();
    List<UserData> selectByExample(UserDataExample example);

    UserData selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") UserData record,
                                 @Param("example") UserDataExample example);

    int updateByExample(@Param("record") UserData record,
                        @Param("example") UserDataExample example);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKey(UserData record);
}