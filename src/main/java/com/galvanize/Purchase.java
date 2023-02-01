package com.galvanize;

import java.math.BigDecimal;

public class Purchase extends OrderItem{
    private String productName;

    public Purchase(String productName, BigDecimal price) {
        super(price);
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public BigDecimal totalPrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "price=" + getPrice() +
                ", productName='" + productName + '\'' +
                '}';
    }
}
