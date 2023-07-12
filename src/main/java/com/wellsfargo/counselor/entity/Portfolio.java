package com.wellsfargo.counselor.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.print.DocFlavor;
import java.util.Date;

@Entity

public class Portfolio {

    @Id
    @GeneratedValue()
    private long ClientID;

    @Id
    @GeneratedValue()
    private long PortfolioID;

    protected Portfolio() {

    }

    //Getter

    public Long getClientID() {
        return ClientID;
    }

    public Long getPortfolioID() {
        return PortfolioID;
    }



}
