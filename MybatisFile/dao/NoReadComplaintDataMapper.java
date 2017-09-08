package com.project.dao;

import com.project.model.NoReadComplaintData;
import com.project.model.NoReadComplaintDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoReadComplaintDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(NoReadComplaintDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(NoReadComplaintDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(NoReadComplaintData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(NoReadComplaintData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<NoReadComplaintData> selectByExample(NoReadComplaintDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") NoReadComplaintData record, @Param("example") NoReadComplaintDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table noreadcomplaintinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") NoReadComplaintData record, @Param("example") NoReadComplaintDataExample example);
}