package com.galvanize;

import java.math.BigDecimal;

public class OrderItem {
    private BigDecimal pricePerMonth;
    private int numberOfMonths;

    public OrderItem(BigDecimal pricePerMonth, int numberOfMonths) {
        this.pricePerMonth = pricePerMonth;
        this.numberOfMonths = numberOfMonths;
    }

    public BigDecimal getPricePerMonth() {
        return pricePerMonth;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }
}
