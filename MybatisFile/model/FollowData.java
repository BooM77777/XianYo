package com.project.model;

public class FollowData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column followinfo_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column followinfo_.followerID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long followerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column followinfo_.followedID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long followedid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column followinfo_.id
     *
     * @return the value of followinfo_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column followinfo_.id
     *
     * @param id the value for followinfo_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column followinfo_.followerID
     *
     * @return the value of followinfo_.followerID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getFollowerid() {
        return followerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column followinfo_.followerID
     *
     * @param followerid the value for followinfo_.followerID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setFollowerid(Long followerid) {
        this.followerid = followerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column followinfo_.followedID
     *
     * @return the value of followinfo_.followedID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getFollowedid() {
        return followedid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column followinfo_.followedID
     *
     * @param followedid the value for followinfo_.followedID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setFollowedid(Long followedid) {
        this.followedid = followedid;
    }
}