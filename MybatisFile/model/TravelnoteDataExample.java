package com.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelnoteDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public TravelnoteDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTravelnoteidIsNull() {
            addCriterion("travelnoteID is null");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidIsNotNull() {
            addCriterion("travelnoteID is not null");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidEqualTo(Long value) {
            addCriterion("travelnoteID =", value, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidNotEqualTo(Long value) {
            addCriterion("travelnoteID <>", value, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidGreaterThan(Long value) {
            addCriterion("travelnoteID >", value, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidGreaterThanOrEqualTo(Long value) {
            addCriterion("travelnoteID >=", value, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidLessThan(Long value) {
            addCriterion("travelnoteID <", value, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidLessThanOrEqualTo(Long value) {
            addCriterion("travelnoteID <=", value, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidIn(List<Long> values) {
            addCriterion("travelnoteID in", values, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidNotIn(List<Long> values) {
            addCriterion("travelnoteID not in", values, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidBetween(Long value1, Long value2) {
            addCriterion("travelnoteID between", value1, value2, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andTravelnoteidNotBetween(Long value1, Long value2) {
            addCriterion("travelnoteID not between", value1, value2, "travelnoteid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNull() {
            addCriterion("authorID is null");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNotNull() {
            addCriterion("authorID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoridEqualTo(Long value) {
            addCriterion("authorID =", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotEqualTo(Long value) {
            addCriterion("authorID <>", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThan(Long value) {
            addCriterion("authorID >", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThanOrEqualTo(Long value) {
            addCriterion("authorID >=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThan(Long value) {
            addCriterion("authorID <", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThanOrEqualTo(Long value) {
            addCriterion("authorID <=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIn(List<Long> values) {
            addCriterion("authorID in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotIn(List<Long> values) {
            addCriterion("authorID not in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridBetween(Long value1, Long value2) {
            addCriterion("authorID between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotBetween(Long value1, Long value2) {
            addCriterion("authorID not between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andScenicidIsNull() {
            addCriterion("scenicID is null");
            return (Criteria) this;
        }

        public Criteria andScenicidIsNotNull() {
            addCriterion("scenicID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicidEqualTo(Long value) {
            addCriterion("scenicID =", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidNotEqualTo(Long value) {
            addCriterion("scenicID <>", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidGreaterThan(Long value) {
            addCriterion("scenicID >", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidGreaterThanOrEqualTo(Long value) {
            addCriterion("scenicID >=", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidLessThan(Long value) {
            addCriterion("scenicID <", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidLessThanOrEqualTo(Long value) {
            addCriterion("scenicID <=", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidIn(List<Long> values) {
            addCriterion("scenicID in", values, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidNotIn(List<Long> values) {
            addCriterion("scenicID not in", values, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidBetween(Long value1, Long value2) {
            addCriterion("scenicID between", value1, value2, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidNotBetween(Long value1, Long value2) {
            addCriterion("scenicID not between", value1, value2, "scenicid");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andContextdirIsNull() {
            addCriterion("contextDir is null");
            return (Criteria) this;
        }

        public Criteria andContextdirIsNotNull() {
            addCriterion("contextDir is not null");
            return (Criteria) this;
        }

        public Criteria andContextdirEqualTo(String value) {
            addCriterion("contextDir =", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirNotEqualTo(String value) {
            addCriterion("contextDir <>", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirGreaterThan(String value) {
            addCriterion("contextDir >", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirGreaterThanOrEqualTo(String value) {
            addCriterion("contextDir >=", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirLessThan(String value) {
            addCriterion("contextDir <", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirLessThanOrEqualTo(String value) {
            addCriterion("contextDir <=", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirLike(String value) {
            addCriterion("contextDir like", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirNotLike(String value) {
            addCriterion("contextDir not like", value, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirIn(List<String> values) {
            addCriterion("contextDir in", values, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirNotIn(List<String> values) {
            addCriterion("contextDir not in", values, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirBetween(String value1, String value2) {
            addCriterion("contextDir between", value1, value2, "contextdir");
            return (Criteria) this;
        }

        public Criteria andContextdirNotBetween(String value1, String value2) {
            addCriterion("contextDir not between", value1, value2, "contextdir");
            return (Criteria) this;
        }

        public Criteria andCollecttimeIsNull() {
            addCriterion("collectTime is null");
            return (Criteria) this;
        }

        public Criteria andCollecttimeIsNotNull() {
            addCriterion("collectTime is not null");
            return (Criteria) this;
        }

        public Criteria andCollecttimeEqualTo(Integer value) {
            addCriterion("collectTime =", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeNotEqualTo(Integer value) {
            addCriterion("collectTime <>", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeGreaterThan(Integer value) {
            addCriterion("collectTime >", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectTime >=", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeLessThan(Integer value) {
            addCriterion("collectTime <", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeLessThanOrEqualTo(Integer value) {
            addCriterion("collectTime <=", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeIn(List<Integer> values) {
            addCriterion("collectTime in", values, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeNotIn(List<Integer> values) {
            addCriterion("collectTime not in", values, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeBetween(Integer value1, Integer value2) {
            addCriterion("collectTime between", value1, value2, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("collectTime not between", value1, value2, "collecttime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNull() {
            addCriterion("readTime is null");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNotNull() {
            addCriterion("readTime is not null");
            return (Criteria) this;
        }

        public Criteria andReadtimeEqualTo(Integer value) {
            addCriterion("readTime =", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotEqualTo(Integer value) {
            addCriterion("readTime <>", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThan(Integer value) {
            addCriterion("readTime >", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("readTime >=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThan(Integer value) {
            addCriterion("readTime <", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThanOrEqualTo(Integer value) {
            addCriterion("readTime <=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIn(List<Integer> values) {
            addCriterion("readTime in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotIn(List<Integer> values) {
            addCriterion("readTime not in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeBetween(Integer value1, Integer value2) {
            addCriterion("readTime between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("readTime not between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeIsNull() {
            addCriterion("praiseTime is null");
            return (Criteria) this;
        }

        public Criteria andPraisetimeIsNotNull() {
            addCriterion("praiseTime is not null");
            return (Criteria) this;
        }

        public Criteria andPraisetimeEqualTo(Integer value) {
            addCriterion("praiseTime =", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeNotEqualTo(Integer value) {
            addCriterion("praiseTime <>", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeGreaterThan(Integer value) {
            addCriterion("praiseTime >", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("praiseTime >=", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeLessThan(Integer value) {
            addCriterion("praiseTime <", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeLessThanOrEqualTo(Integer value) {
            addCriterion("praiseTime <=", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeIn(List<Integer> values) {
            addCriterion("praiseTime in", values, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeNotIn(List<Integer> values) {
            addCriterion("praiseTime not in", values, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeBetween(Integer value1, Integer value2) {
            addCriterion("praiseTime between", value1, value2, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("praiseTime not between", value1, value2, "praisetime");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidIsNull() {
            addCriterion("RelateScenicID is null");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidIsNotNull() {
            addCriterion("RelateScenicID is not null");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidEqualTo(Integer value) {
            addCriterion("RelateScenicID =", value, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidNotEqualTo(Integer value) {
            addCriterion("RelateScenicID <>", value, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidGreaterThan(Integer value) {
            addCriterion("RelateScenicID >", value, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RelateScenicID >=", value, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidLessThan(Integer value) {
            addCriterion("RelateScenicID <", value, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidLessThanOrEqualTo(Integer value) {
            addCriterion("RelateScenicID <=", value, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidIn(List<Integer> values) {
            addCriterion("RelateScenicID in", values, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidNotIn(List<Integer> values) {
            addCriterion("RelateScenicID not in", values, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidBetween(Integer value1, Integer value2) {
            addCriterion("RelateScenicID between", value1, value2, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andRelatescenicidNotBetween(Integer value1, Integer value2) {
            addCriterion("RelateScenicID not between", value1, value2, "relatescenicid");
            return (Criteria) this;
        }

        public Criteria andComplainttimeIsNull() {
            addCriterion("complaintTime is null");
            return (Criteria) this;
        }

        public Criteria andComplainttimeIsNotNull() {
            addCriterion("complaintTime is not null");
            return (Criteria) this;
        }

        public Criteria andComplainttimeEqualTo(Integer value) {
            addCriterion("complaintTime =", value, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeNotEqualTo(Integer value) {
            addCriterion("complaintTime <>", value, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeGreaterThan(Integer value) {
            addCriterion("complaintTime >", value, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("complaintTime >=", value, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeLessThan(Integer value) {
            addCriterion("complaintTime <", value, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeLessThanOrEqualTo(Integer value) {
            addCriterion("complaintTime <=", value, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeIn(List<Integer> values) {
            addCriterion("complaintTime in", values, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeNotIn(List<Integer> values) {
            addCriterion("complaintTime not in", values, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeBetween(Integer value1, Integer value2) {
            addCriterion("complaintTime between", value1, value2, "complainttime");
            return (Criteria) this;
        }

        public Criteria andComplainttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("complaintTime not between", value1, value2, "complainttime");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlIsNull() {
            addCriterion("microblogUrl is null");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlIsNotNull() {
            addCriterion("microblogUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlEqualTo(String value) {
            addCriterion("microblogUrl =", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlNotEqualTo(String value) {
            addCriterion("microblogUrl <>", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlGreaterThan(String value) {
            addCriterion("microblogUrl >", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlGreaterThanOrEqualTo(String value) {
            addCriterion("microblogUrl >=", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlLessThan(String value) {
            addCriterion("microblogUrl <", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlLessThanOrEqualTo(String value) {
            addCriterion("microblogUrl <=", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlLike(String value) {
            addCriterion("microblogUrl like", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlNotLike(String value) {
            addCriterion("microblogUrl not like", value, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlIn(List<String> values) {
            addCriterion("microblogUrl in", values, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlNotIn(List<String> values) {
            addCriterion("microblogUrl not in", values, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlBetween(String value1, String value2) {
            addCriterion("microblogUrl between", value1, value2, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andMicroblogurlNotBetween(String value1, String value2) {
            addCriterion("microblogUrl not between", value1, value2, "microblogurl");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated do_not_delete_during_merge Fri Sep 08 10:01:11 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table travelnoteinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}