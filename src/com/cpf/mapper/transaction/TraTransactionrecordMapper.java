package com.cpf.mapper.transaction;

import com.cpf.beans.transaction.TraTransactionrecord;

public interface TraTransactionrecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_transactionrecord
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_transactionrecord
     *
     * @mbggenerated
     */
    int insert(TraTransactionrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_transactionrecord
     *
     * @mbggenerated
     */
    int insertSelective(TraTransactionrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_transactionrecord
     *
     * @mbggenerated
     */
    TraTransactionrecord selectByPrimaryKey(String recordid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_transactionrecord
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TraTransactionrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tra_transactionrecord
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TraTransactionrecord record);
}