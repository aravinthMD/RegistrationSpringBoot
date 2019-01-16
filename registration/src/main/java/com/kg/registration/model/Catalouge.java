package com.kg.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Catalouge
 */
@Entity
@Table
public class Catalouge {

    private  String Productname;
    private  String quantity;
    private String description;
    private int userid;
    /**
     * @return the productname
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
public int getUserid() {
    return userid;
}
/**
 * @param invalid the userid to set
 */
public void setUserid(int userid) {
    this.userid = userid;
}
    public String getProductname() {
        return Productname;
    }
    /**
     * @param productname the productname to set
     */
    public void setProductname(String productname) {
        Productname = productname;
    }
    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
        
    }
/**
 * @return the description
 */
public String getDescription() {
    return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
    this.description = description;
}
/**
 * @return the userid
 */

Catalouge()
{}
}