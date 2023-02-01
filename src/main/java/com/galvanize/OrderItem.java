package com.galvanize;

import java.math.BigDecimal;

public abstract class OrderItem {
    private BigDecimal price;
    private int duration;

    public OrderItem() {
    }

    public OrderItem(BigDecimal price) {
        this.price = price;
    }

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

    public abstract BigDecimal totalPrice();
}