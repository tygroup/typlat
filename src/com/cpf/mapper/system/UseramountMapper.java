package com.cpf.mapper.system;

import com.cpf.beans.system.Useramount;

public interface UseramountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useramount
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useramount
     *
     * @mbggenerated
     */
    int insert(Useramount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useramount
     *
     * @mbggenerated
     */
    int insertSelective(Useramount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useramount
     *
     * @mbggenerated
     */
    Useramount selectByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useramount
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Useramount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useramount
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Useramount record);
}