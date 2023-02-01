package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Rental extends OrderItem{

    private BigDecimal rentalPricePerDay;
    private LocalDateTime endDate;

    public Rental(BigDecimal rentalPricePerDay, LocalDateTime endDate) {
        this.rentalPricePerDay = rentalPricePerDay;
        this.endDate = endDate;
    }

    public BigDecimal getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public BigDecimal totalPrice() {
        long days = LocalDateTime.now().until(getEndDate(), ChronoUnit.DAYS) +1;
        return getRentalPricePerDay().multiply(BigDecimal.valueOf(days));
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalPricePerDay=" + rentalPricePerDay +
                ", endDate=" + endDate +
                '}';
    }
}
