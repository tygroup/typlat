package com.cpf.mapper.system;

import com.cpf.beans.system.SysAdplacement;

public interface SysAdplacementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_adplacement
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String placementid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_adplacement
     *
     * @mbggenerated
     */
    int insert(SysAdplacement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_adplacement
     *
     * @mbggenerated
     */
    int insertSelective(SysAdplacement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_adplacement
     *
     * @mbggenerated
     */
    SysAdplacement selectByPrimaryKey(String placementid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_adplacement
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysAdplacement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_adplacement
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysAdplacement record);
}