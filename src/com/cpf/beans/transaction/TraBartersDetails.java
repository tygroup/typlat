package com.cpf.beans.transaction;

public class TraBartersDetails {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_barters_details.bardetailsid
     *
     * @mbggenerated
     */
    private String bardetailsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_barters_details.Barorderid
     *
     * @mbggenerated
     */
    private String barorderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tra_barters_details.productid
     *
     * @mbggenerated
     */
    private String productid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_barters_details.bardetailsid
     *
     * @return the value of tra_barters_details.bardetailsid
     *
     * @mbggenerated
     */
    public String getBardetailsid() {
        return bardetailsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_barters_details.bardetailsid
     *
     * @param bardetailsid the value for tra_barters_details.bardetailsid
     *
     * @mbggenerated
     */
    public void setBardetailsid(String bardetailsid) {
        this.bardetailsid = bardetailsid == null ? null : bardetailsid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_barters_details.Barorderid
     *
     * @return the value of tra_barters_details.Barorderid
     *
     * @mbggenerated
     */
    public String getBarorderid() {
        return barorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_barters_details.Barorderid
     *
     * @param barorderid the value for tra_barters_details.Barorderid
     *
     * @mbggenerated
     */
    public void setBarorderid(String barorderid) {
        this.barorderid = barorderid == null ? null : barorderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tra_barters_details.productid
     *
     * @return the value of tra_barters_details.productid
     *
     * @mbggenerated
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tra_barters_details.productid
     *
     * @param productid the value for tra_barters_details.productid
     *
     * @mbggenerated
     */
    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }
}