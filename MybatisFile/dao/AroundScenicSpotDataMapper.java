package com.project.dao;

import com.project.model.AroundScenicSpotData;
import com.project.model.AroundScenicSpotDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AroundScenicSpotDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(AroundScenicSpotDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(AroundScenicSpotDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(AroundScenicSpotData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(AroundScenicSpotData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<AroundScenicSpotData> selectByExample(AroundScenicSpotDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") AroundScenicSpotData record, @Param("example") AroundScenicSpotDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") AroundScenicSpotData record, @Param("example") AroundScenicSpotDataExample example);
}