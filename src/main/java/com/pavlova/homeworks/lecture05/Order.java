package com.pavlova.homeworks.lecture05;

import java.util.Date;

public class Order {
    private String item;
    private Date deliveryDate;
    private int size;
    private double price;

    public Order(String item, Date deliveryDate, int size, double price) {
        this.item = item;
        this.deliveryDate = deliveryDate;
        this.size = size;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
