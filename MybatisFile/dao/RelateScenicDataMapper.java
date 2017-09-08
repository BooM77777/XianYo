package com.project.dao;

import com.project.model.RelateScenicData;
import com.project.model.RelateScenicDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelateScenicDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(RelateScenicDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(RelateScenicDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(RelateScenicData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(RelateScenicData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<RelateScenicData> selectByExample(RelateScenicDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") RelateScenicData record, @Param("example") RelateScenicDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relatescenicinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") RelateScenicData record, @Param("example") RelateScenicDataExample example);
}