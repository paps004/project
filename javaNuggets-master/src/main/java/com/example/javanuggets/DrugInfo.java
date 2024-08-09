package com.example.javanuggets;

public class DrugInfo {
    private int drugId;
    private String drugName;
    private int supplierId;
    private double price;
    private int quantity;

    public DrugInfo(int drugId, String drugName, int supplierId, double price, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.supplierId = supplierId;
        this.price = price;
        this.quantity = quantity;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
