package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Order {

    private ArrayList<Object> items = new ArrayList<>();
    private BigDecimal total = new BigDecimal("0.00");

    void addItem(OrderItem item) {
        items.add(item);
        total = total.add(item.totalPrice());
    }

    public BigDecimal getTotal() {
        return total;
    }

    public ArrayList<Object> getItems() {
        return new ArrayList<>(items);
    }
}
