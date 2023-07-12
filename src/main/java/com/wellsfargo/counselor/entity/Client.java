package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.print.DocFlavor;
import java.util.Date;

@Entity

public class Client {

    @Id
    @GeneratedValue()
    private long ClientID;


    @Column(nullable = false)
    private String Email;

    @Column(nullable = false)
    private String Phone;

    @Column(nullable = false)
    private String Name;

    @Id
    @GeneratedValue()
    private long FinancialAdvisorId;


    //Constructor for class Client


    protected Client() {

    }

    public Client(String Email, String Phone, String Name) {
        this.Email = Email;
        this.Phone = Phone;
        this.Name = Name;

    }

    //SETTER

    public void setEmail(String Email){
        this.Email = Email;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public void setName(String Name){
        this.Name = Name;
    }



    //GETTER

    public Long getClientID() {
        return ClientID;
    }

    public Long getFinancialAdvisorId() {
        return FinancialAdvisorId;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPhone() {
        return this.Phone;
    }

    public String getName() {
        return this.Name;
    }

}

