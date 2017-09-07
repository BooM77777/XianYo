package com.xianyo.loginmodule.dao.pojo;

public class UserData {
    private Long userid;

    private String username;

    private String password;

    private String phonenumber;

    private String email;

    private String sex;

    private Boolean allowgetlocation;

    private String headshot;

    private Integer fansnumber;

    private Integer concernnumber;

    private Integer microblognumber;

    private Integer answernumber;

    private Integer questionnumber;

    private Integer newanswers;

    private String selfintroduce;

    private String indexurl;

    private Boolean islogin;

    public void init() {
        fansnumber = 0;
        concernnumber = 0;
        microblognumber = 0;
        answernumber = 0;
        questionnumber = 0;
        newanswers = 0;
        islogin = false;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Boolean getAllowgetlocation() {
        return allowgetlocation;
    }

    public void setAllowgetlocation(Boolean allowgetlocation) {
        this.allowgetlocation = allowgetlocation;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot == null ? null : headshot.trim();
    }

    public Integer getFansnumber() {
        return fansnumber;
    }

    public void setFansnumber(Integer fansnumber) {
        this.fansnumber = fansnumber;
    }

    public Integer getConcernnumber() {
        return concernnumber;
    }

    public void setConcernnumber(Integer concernnumber) {
        this.concernnumber = concernnumber;
    }

    public Integer getMicroblognumber() {
        return microblognumber;
    }

    public void setMicroblognumber(Integer microblognumber) {
        this.microblognumber = microblognumber;
    }

    public Integer getAnswernumber() {
        return answernumber;
    }

    public void setAnswernumber(Integer answernumber) {
        this.answernumber = answernumber;
    }

    public Integer getQuestionnumber() {
        return questionnumber;
    }

    public void setQuestionnumber(Integer questionnumber) {
        this.questionnumber = questionnumber;
    }

    public Integer getNewanswers() {
        return newanswers;
    }

    public void setNewanswers(Integer newanswers) {
        this.newanswers = newanswers;
    }

    public String getSelfintroduce() {
        return selfintroduce;
    }

    public void setSelfintroduce(String selfintroduce) {
        this.selfintroduce = selfintroduce == null ? null : selfintroduce.trim();
    }

    public String getIndexurl() {
        return indexurl;
    }

    public void setIndexurl(String indexurl) {
        this.indexurl = indexurl == null ? null : indexurl.trim();
    }

    public Boolean getIslogin() {
        return islogin;
    }

    public void setIslogin(Boolean islogin) {
        this.islogin = islogin;
    }
}