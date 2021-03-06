package com.cpf.beans.system;

import java.util.Date;

public class SysCollect {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_collect.collectId
     *
     * @mbggenerated
     */
    private String collectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_collect.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_collect.productId
     *
     * @mbggenerated
     */
    private String productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_collect.collectDate
     *
     * @mbggenerated
     */
    private Date collectdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_collect.collectType
     *
     * @mbggenerated
     */
    private String collecttype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_collect.collectId
     *
     * @return the value of sys_collect.collectId
     *
     * @mbggenerated
     */
    public String getCollectid() {
        return collectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_collect.collectId
     *
     * @param collectid the value for sys_collect.collectId
     *
     * @mbggenerated
     */
    public void setCollectid(String collectid) {
        this.collectid = collectid == null ? null : collectid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_collect.user_id
     *
     * @return the value of sys_collect.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_collect.user_id
     *
     * @param userId the value for sys_collect.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_collect.productId
     *
     * @return the value of sys_collect.productId
     *
     * @mbggenerated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_collect.productId
     *
     * @param productid the value for sys_collect.productId
     *
     * @mbggenerated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_collect.collectDate
     *
     * @return the value of sys_collect.collectDate
     *
     * @mbggenerated
     */
    public Date getCollectdate() {
        return collectdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_collect.collectDate
     *
     * @param collectdate the value for sys_collect.collectDate
     *
     * @mbggenerated
     */
    public void setCollectdate(Date collectdate) {
        this.collectdate = collectdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_collect.collectType
     *
     * @return the value of sys_collect.collectType
     *
     * @mbggenerated
     */
    public String getCollecttype() {
        return collecttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_collect.collectType
     *
     * @param collecttype the value for sys_collect.collectType
     *
     * @mbggenerated
     */
    public void setCollecttype(String collecttype) {
        this.collecttype = collecttype == null ? null : collecttype.trim();
    }
}