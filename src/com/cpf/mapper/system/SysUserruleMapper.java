package com.cpf.mapper.system;

import com.cpf.beans.system.SysUserrule;

public interface SysUserruleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_userrule
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String ruleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_userrule
     *
     * @mbggenerated
     */
    int insert(SysUserrule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_userrule
     *
     * @mbggenerated
     */
    int insertSelective(SysUserrule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_userrule
     *
     * @mbggenerated
     */
    SysUserrule selectByPrimaryKey(String ruleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_userrule
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysUserrule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_userrule
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysUserrule record);
}