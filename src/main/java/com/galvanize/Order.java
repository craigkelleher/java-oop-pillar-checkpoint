package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Order {

    private ArrayList<Object> items = new ArrayList<>();
    private BigDecimal total = new BigDecimal("0.00");

    void addItem(Object item) {
        items.add(item);
        if (item instanceof Lease) {
            Lease lease = (Lease) item;
            total = total.add(lease.getPricePerMonth().multiply(BigDecimal.valueOf(lease.getNumberOfMonths())));
        }
        else if (item instanceof Purchase) {
            total = total.add(((Purchase) item).getPrice());
        }
        else if (item instanceof Rental) {
            Rental rental = (Rental) item;
            long days = LocalDateTime.now().until(rental.getEndDate(), ChronoUnit.DAYS) + 1;
            total = total.add(rental.getRentalPricePerDay().multiply(BigDecimal.valueOf(days)));
        }
    }

    public BigDecimal getTotal() {
        return total;
    }

    public ArrayList<Object> getItems() {
        return new ArrayList<>(items);
    }
}
