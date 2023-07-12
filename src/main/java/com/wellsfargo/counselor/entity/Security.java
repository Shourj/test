package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.print.DocFlavor;
import java.util.Date;

@Entity

public class Security {

    @Id
    @GeneratedValue()
    private long SecurityID;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private int Quantity;

    @Column(nullable = false)
    private float PurchasePrice;

    @Column(nullable = false)
    private Date PurchaseDate;

    @Id
    @GeneratedValue()
    private long PortfolioID;

    //Constructor for class Security


    protected Security() {

    }

    public Security(String Name, String Category, Integer Quantity, Float PurchasePrice, Date PurchaseDate) {
        this.Name = Name;
        this.Category = Category;
        this.Quantity = Quantity;
        this.PurchasePrice = PurchasePrice;
        this.PurchaseDate = PurchaseDate;
    }

    //getter and setter for the instance variables


    //SETTER
    public void setName(String name){
        this.Name = name;
    }

    public void setCategory(String Category){
        this.Category = Category;
    }

    public void setQuantity(Integer Quantity){
        this.Quantity = Quantity;
    }

    public void setPurchasePrice(Float PurchasePrice){
        this.PurchasePrice = PurchasePrice;
    }

    public void setPurchaseDate(Date PurchaseDate){
        this.PurchaseDate = PurchaseDate;
    }

    //GETTER

    public Long getSecurityID() {
        return SecurityID;
    }

    public Long getPortfolioID() {
        return PortfolioID;
    }

    public String getName(String Name){
       return this.Name;
    }

    public String getCategory(String Category){
        return this.Category;
    }
    public Integer getQuantity(Integer Quantity){
        return this.Quantity;
    }
    public Float getPurchasePrice(Float PurchasePrice){
        return this.PurchasePrice;
    }
    public Date getPurchaseDate(Date PurchaseDate){
        return this.PurchaseDate;
    }
}
