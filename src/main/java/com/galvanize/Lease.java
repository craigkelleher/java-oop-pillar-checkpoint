package com.galvanize;

import java.math.BigDecimal;

public class Lease extends OrderItem{

    private String licensePlate;

    public Lease(String licensePlate, BigDecimal pricePerMonth, int numberOfMonths) {
        super(pricePerMonth, numberOfMonths);
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "pricePerMonth=" + getPrice() +
                ", numberOfMonths=" + getDuration() +
                ", licensePlate='" + getLicensePlate() + '\'' +
                '}';
    }
}
