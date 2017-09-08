package com.project.dao;

import com.project.model.QuestionCollectData;
import com.project.model.QuestionCollectDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionCollectDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(QuestionCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(QuestionCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(QuestionCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(QuestionCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<QuestionCollectData> selectByExample(QuestionCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    QuestionCollectData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") QuestionCollectData record, @Param("example") QuestionCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") QuestionCollectData record, @Param("example") QuestionCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKeySelective(QuestionCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questioncollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKey(QuestionCollectData record);
}