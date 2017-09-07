package com.xianyo.loginmodule.dao.mapper;

import java.util.ArrayList;
import java.util.List;

public class UserDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phonenumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phonenumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phonenumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phonenumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phonenumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phonenumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phonenumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phonenumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phonenumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phonenumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phonenumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phonenumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationIsNull() {
            addCriterion("allowGetLocation is null");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationIsNotNull() {
            addCriterion("allowGetLocation is not null");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationEqualTo(Boolean value) {
            addCriterion("allowGetLocation =", value, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationNotEqualTo(Boolean value) {
            addCriterion("allowGetLocation <>", value, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationGreaterThan(Boolean value) {
            addCriterion("allowGetLocation >", value, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowGetLocation >=", value, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationLessThan(Boolean value) {
            addCriterion("allowGetLocation <", value, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationLessThanOrEqualTo(Boolean value) {
            addCriterion("allowGetLocation <=", value, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationIn(List<Boolean> values) {
            addCriterion("allowGetLocation in", values, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationNotIn(List<Boolean> values) {
            addCriterion("allowGetLocation not in", values, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationBetween(Boolean value1, Boolean value2) {
            addCriterion("allowGetLocation between", value1, value2, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andAllowgetlocationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowGetLocation not between", value1, value2, "allowgetlocation");
            return (Criteria) this;
        }

        public Criteria andHeadshotIsNull() {
            addCriterion("headshot is null");
            return (Criteria) this;
        }

        public Criteria andHeadshotIsNotNull() {
            addCriterion("headshot is not null");
            return (Criteria) this;
        }

        public Criteria andHeadshotEqualTo(String value) {
            addCriterion("headshot =", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotNotEqualTo(String value) {
            addCriterion("headshot <>", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotGreaterThan(String value) {
            addCriterion("headshot >", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotGreaterThanOrEqualTo(String value) {
            addCriterion("headshot >=", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotLessThan(String value) {
            addCriterion("headshot <", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotLessThanOrEqualTo(String value) {
            addCriterion("headshot <=", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotLike(String value) {
            addCriterion("headshot like", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotNotLike(String value) {
            addCriterion("headshot not like", value, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotIn(List<String> values) {
            addCriterion("headshot in", values, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotNotIn(List<String> values) {
            addCriterion("headshot not in", values, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotBetween(String value1, String value2) {
            addCriterion("headshot between", value1, value2, "headshot");
            return (Criteria) this;
        }

        public Criteria andHeadshotNotBetween(String value1, String value2) {
            addCriterion("headshot not between", value1, value2, "headshot");
            return (Criteria) this;
        }

        public Criteria andFansnumberIsNull() {
            addCriterion("fansNumber is null");
            return (Criteria) this;
        }

        public Criteria andFansnumberIsNotNull() {
            addCriterion("fansNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFansnumberEqualTo(Integer value) {
            addCriterion("fansNumber =", value, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberNotEqualTo(Integer value) {
            addCriterion("fansNumber <>", value, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberGreaterThan(Integer value) {
            addCriterion("fansNumber >", value, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fansNumber >=", value, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberLessThan(Integer value) {
            addCriterion("fansNumber <", value, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberLessThanOrEqualTo(Integer value) {
            addCriterion("fansNumber <=", value, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberIn(List<Integer> values) {
            addCriterion("fansNumber in", values, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberNotIn(List<Integer> values) {
            addCriterion("fansNumber not in", values, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberBetween(Integer value1, Integer value2) {
            addCriterion("fansNumber between", value1, value2, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andFansnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fansNumber not between", value1, value2, "fansnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberIsNull() {
            addCriterion("concernNumber is null");
            return (Criteria) this;
        }

        public Criteria andConcernnumberIsNotNull() {
            addCriterion("concernNumber is not null");
            return (Criteria) this;
        }

        public Criteria andConcernnumberEqualTo(Integer value) {
            addCriterion("concernNumber =", value, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberNotEqualTo(Integer value) {
            addCriterion("concernNumber <>", value, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberGreaterThan(Integer value) {
            addCriterion("concernNumber >", value, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("concernNumber >=", value, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberLessThan(Integer value) {
            addCriterion("concernNumber <", value, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberLessThanOrEqualTo(Integer value) {
            addCriterion("concernNumber <=", value, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberIn(List<Integer> values) {
            addCriterion("concernNumber in", values, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberNotIn(List<Integer> values) {
            addCriterion("concernNumber not in", values, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberBetween(Integer value1, Integer value2) {
            addCriterion("concernNumber between", value1, value2, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andConcernnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("concernNumber not between", value1, value2, "concernnumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberIsNull() {
            addCriterion("microblogNumber is null");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberIsNotNull() {
            addCriterion("microblogNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberEqualTo(Integer value) {
            addCriterion("microblogNumber =", value, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberNotEqualTo(Integer value) {
            addCriterion("microblogNumber <>", value, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberGreaterThan(Integer value) {
            addCriterion("microblogNumber >", value, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("microblogNumber >=", value, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberLessThan(Integer value) {
            addCriterion("microblogNumber <", value, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberLessThanOrEqualTo(Integer value) {
            addCriterion("microblogNumber <=", value, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberIn(List<Integer> values) {
            addCriterion("microblogNumber in", values, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberNotIn(List<Integer> values) {
            addCriterion("microblogNumber not in", values, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberBetween(Integer value1, Integer value2) {
            addCriterion("microblogNumber between", value1, value2, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andMicroblognumberNotBetween(Integer value1, Integer value2) {
            addCriterion("microblogNumber not between", value1, value2, "microblognumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberIsNull() {
            addCriterion("answerNumber is null");
            return (Criteria) this;
        }

        public Criteria andAnswernumberIsNotNull() {
            addCriterion("answerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAnswernumberEqualTo(Integer value) {
            addCriterion("answerNumber =", value, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberNotEqualTo(Integer value) {
            addCriterion("answerNumber <>", value, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberGreaterThan(Integer value) {
            addCriterion("answerNumber >", value, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerNumber >=", value, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberLessThan(Integer value) {
            addCriterion("answerNumber <", value, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberLessThanOrEqualTo(Integer value) {
            addCriterion("answerNumber <=", value, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberIn(List<Integer> values) {
            addCriterion("answerNumber in", values, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberNotIn(List<Integer> values) {
            addCriterion("answerNumber not in", values, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberBetween(Integer value1, Integer value2) {
            addCriterion("answerNumber between", value1, value2, "answernumber");
            return (Criteria) this;
        }

        public Criteria andAnswernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("answerNumber not between", value1, value2, "answernumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberIsNull() {
            addCriterion("questionNumber is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberIsNotNull() {
            addCriterion("questionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberEqualTo(Integer value) {
            addCriterion("questionNumber =", value, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberNotEqualTo(Integer value) {
            addCriterion("questionNumber <>", value, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberGreaterThan(Integer value) {
            addCriterion("questionNumber >", value, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionNumber >=", value, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberLessThan(Integer value) {
            addCriterion("questionNumber <", value, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberLessThanOrEqualTo(Integer value) {
            addCriterion("questionNumber <=", value, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberIn(List<Integer> values) {
            addCriterion("questionNumber in", values, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberNotIn(List<Integer> values) {
            addCriterion("questionNumber not in", values, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberBetween(Integer value1, Integer value2) {
            addCriterion("questionNumber between", value1, value2, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("questionNumber not between", value1, value2, "questionnumber");
            return (Criteria) this;
        }

        public Criteria andNewanswersIsNull() {
            addCriterion("newAnswers is null");
            return (Criteria) this;
        }

        public Criteria andNewanswersIsNotNull() {
            addCriterion("newAnswers is not null");
            return (Criteria) this;
        }

        public Criteria andNewanswersEqualTo(Integer value) {
            addCriterion("newAnswers =", value, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersNotEqualTo(Integer value) {
            addCriterion("newAnswers <>", value, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersGreaterThan(Integer value) {
            addCriterion("newAnswers >", value, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersGreaterThanOrEqualTo(Integer value) {
            addCriterion("newAnswers >=", value, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersLessThan(Integer value) {
            addCriterion("newAnswers <", value, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersLessThanOrEqualTo(Integer value) {
            addCriterion("newAnswers <=", value, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersIn(List<Integer> values) {
            addCriterion("newAnswers in", values, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersNotIn(List<Integer> values) {
            addCriterion("newAnswers not in", values, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersBetween(Integer value1, Integer value2) {
            addCriterion("newAnswers between", value1, value2, "newanswers");
            return (Criteria) this;
        }

        public Criteria andNewanswersNotBetween(Integer value1, Integer value2) {
            addCriterion("newAnswers not between", value1, value2, "newanswers");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceIsNull() {
            addCriterion("selfIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceIsNotNull() {
            addCriterion("selfIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceEqualTo(String value) {
            addCriterion("selfIntroduce =", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceNotEqualTo(String value) {
            addCriterion("selfIntroduce <>", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceGreaterThan(String value) {
            addCriterion("selfIntroduce >", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("selfIntroduce >=", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceLessThan(String value) {
            addCriterion("selfIntroduce <", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceLessThanOrEqualTo(String value) {
            addCriterion("selfIntroduce <=", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceLike(String value) {
            addCriterion("selfIntroduce like", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceNotLike(String value) {
            addCriterion("selfIntroduce not like", value, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceIn(List<String> values) {
            addCriterion("selfIntroduce in", values, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceNotIn(List<String> values) {
            addCriterion("selfIntroduce not in", values, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceBetween(String value1, String value2) {
            addCriterion("selfIntroduce between", value1, value2, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andSelfintroduceNotBetween(String value1, String value2) {
            addCriterion("selfIntroduce not between", value1, value2, "selfintroduce");
            return (Criteria) this;
        }

        public Criteria andIndexurlIsNull() {
            addCriterion("indexUrl is null");
            return (Criteria) this;
        }

        public Criteria andIndexurlIsNotNull() {
            addCriterion("indexUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIndexurlEqualTo(String value) {
            addCriterion("indexUrl =", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlNotEqualTo(String value) {
            addCriterion("indexUrl <>", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlGreaterThan(String value) {
            addCriterion("indexUrl >", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlGreaterThanOrEqualTo(String value) {
            addCriterion("indexUrl >=", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlLessThan(String value) {
            addCriterion("indexUrl <", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlLessThanOrEqualTo(String value) {
            addCriterion("indexUrl <=", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlLike(String value) {
            addCriterion("indexUrl like", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlNotLike(String value) {
            addCriterion("indexUrl not like", value, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlIn(List<String> values) {
            addCriterion("indexUrl in", values, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlNotIn(List<String> values) {
            addCriterion("indexUrl not in", values, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlBetween(String value1, String value2) {
            addCriterion("indexUrl between", value1, value2, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIndexurlNotBetween(String value1, String value2) {
            addCriterion("indexUrl not between", value1, value2, "indexurl");
            return (Criteria) this;
        }

        public Criteria andIsloginIsNull() {
            addCriterion("islogin is null");
            return (Criteria) this;
        }

        public Criteria andIsloginIsNotNull() {
            addCriterion("islogin is not null");
            return (Criteria) this;
        }

        public Criteria andIsloginEqualTo(Boolean value) {
            addCriterion("islogin =", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotEqualTo(Boolean value) {
            addCriterion("islogin <>", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginGreaterThan(Boolean value) {
            addCriterion("islogin >", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("islogin >=", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginLessThan(Boolean value) {
            addCriterion("islogin <", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginLessThanOrEqualTo(Boolean value) {
            addCriterion("islogin <=", value, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginIn(List<Boolean> values) {
            addCriterion("islogin in", values, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotIn(List<Boolean> values) {
            addCriterion("islogin not in", values, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginBetween(Boolean value1, Boolean value2) {
            addCriterion("islogin between", value1, value2, "islogin");
            return (Criteria) this;
        }

        public Criteria andIsloginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("islogin not between", value1, value2, "islogin");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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