package com.project.model;

public class AdministratorData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administratorinfo_.adminID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long adminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administratorinfo_.adminName
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private String adminname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administratorinfo_.password
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administratorinfo_.phonenumber
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private String phonenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column administratorinfo_.email
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administratorinfo_.adminID
     *
     * @return the value of administratorinfo_.adminID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administratorinfo_.adminID
     *
     * @param adminid the value for administratorinfo_.adminID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administratorinfo_.adminName
     *
     * @return the value of administratorinfo_.adminName
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administratorinfo_.adminName
     *
     * @param adminname the value for administratorinfo_.adminName
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administratorinfo_.password
     *
     * @return the value of administratorinfo_.password
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administratorinfo_.password
     *
     * @param password the value for administratorinfo_.password
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administratorinfo_.phonenumber
     *
     * @return the value of administratorinfo_.phonenumber
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administratorinfo_.phonenumber
     *
     * @param phonenumber the value for administratorinfo_.phonenumber
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column administratorinfo_.email
     *
     * @return the value of administratorinfo_.email
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column administratorinfo_.email
     *
     * @param email the value for administratorinfo_.email
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}