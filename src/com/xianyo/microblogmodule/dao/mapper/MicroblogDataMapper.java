package com.xianyo.microblogmodule.dao.mapper;


import java.util.List;

import com.xianyo.microblogmodule.dao.mapper.MicroblogDataExample;
import com.xianyo.microblogmodule.dao.pojo.MicroblogData;
import org.apache.ibatis.annotations.Param;

public interface MicroblogDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int countByExample(MicroblogDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int deleteByExample(MicroblogDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int deleteByPrimaryKey(Long microblogid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int insert(MicroblogData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int insertSelective(MicroblogData record);
//    List<MicroblogData> selectAllByUserID();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    List<MicroblogData> selectByExample(MicroblogDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    MicroblogData selectByPrimaryKey(Long microblogid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") MicroblogData record, @Param("example") MicroblogDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int updateByExample(@Param("record") MicroblogData record, @Param("example") MicroblogDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int updateByPrimaryKeySelective(MicroblogData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microbloginfo_
     *
     * @mbggenerated Sun Sep 10 12:38:31 CST 2017
     */
    int updateByPrimaryKey(MicroblogData record);
}