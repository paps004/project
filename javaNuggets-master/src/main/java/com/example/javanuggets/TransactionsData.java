package com.example.javanuggets;

import java.util.Date;

public class TransactionsData {
    private int purchaseID;
    private int drugID;
    private int buyerID;
    private Date purchaseDate;
    private int quantity;

    public TransactionsData(int purchaseID, int drugID, int buyerID, Date purchaseDate, int quantity) {
        this.purchaseID = purchaseID;
        this.drugID = drugID;
        this.buyerID = buyerID;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public int getDrugID() {
        return drugID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }
}

