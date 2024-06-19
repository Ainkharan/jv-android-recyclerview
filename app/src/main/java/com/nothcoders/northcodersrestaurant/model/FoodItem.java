package com.nothcoders.northcodersrestaurant.model;

public class FoodItem {

    private int itemImg;
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    // Constructor
    public FoodItem(int itemImg, String itemName, String itemDescription, double itemPrice) {
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    // Getters
    public int getItemImg() {
        return itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    // Setters
    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}

