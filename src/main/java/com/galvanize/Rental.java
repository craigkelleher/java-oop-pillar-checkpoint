package com.galvanize;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Rental {

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
    public String toString() {
        return "Rental{" +
                "rentalPricePerDay=" + rentalPricePerDay +
                ", endDate=" + endDate +
                '}';
    }
}
