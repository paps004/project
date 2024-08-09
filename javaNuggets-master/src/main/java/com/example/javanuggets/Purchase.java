package com.example.javanuggets;

import java.util.Date;

public class Purchase {
    private static int count = 1;
    private Integer drugID;
    private Integer buyerID;
    private Date purchaseDate;
    private int quantity;
    private int id;

    public Purchase( Integer drugID, Integer buyerID, Date purchaseDate, int quantity) {
        this.drugID = drugID;
        this.buyerID = buyerID;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.id = count++;
    }

    // Getters and setters

    public int getId() {
        return this.id;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public Integer getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(Integer buyerID) {
        this.buyerID = buyerID;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
