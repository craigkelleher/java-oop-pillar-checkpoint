package com.galvanize;

import java.math.BigDecimal;

public class Lease {

    private BigDecimal pricePerMonth;
    private int numberOfMonths;
    private String licensePlate;

    public Lease(String licensePlate, BigDecimal pricePerMonth, int numberOfMonths) {
        this.licensePlate = licensePlate;
        this.pricePerMonth = pricePerMonth;
        this.numberOfMonths = numberOfMonths;
    }

    public BigDecimal getPricePerMonth() {
        return pricePerMonth;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "pricePerMonth=" + pricePerMonth +
                ", numberOfMonths=" + numberOfMonths +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
