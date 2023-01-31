package com.galvanize;

import java.math.BigDecimal;

public class Purchase {

    private BigDecimal price;
    private String productName;

    public Purchase(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
