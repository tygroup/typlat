package com.cpf.mapper.transaction;

import com.cpf.beans.transaction.TraRechargerecords;

public interface TraRechargerecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_rechargerecords
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String rechargid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_rechargerecords
     *
     * @mbggenerated
     */
    int insert(TraRechargerecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_rechargerecords
     *
     * @mbggenerated
     */
    int insertSelective(TraRechargerecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_rechargerecords
     *
     * @mbggenerated
     */
    TraRechargerecords selectByPrimaryKey(String rechargid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_rechargerecords
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TraRechargerecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_rechargerecords
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TraRechargerecords record);
}