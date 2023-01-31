package com.galvanize;

import java.math.BigDecimal;

public class OrderItem {
    private BigDecimal price;
    private int duration;

    public OrderItem(BigDecimal price, int duration) {
        this.price = price;
        this.duration = duration;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }
}