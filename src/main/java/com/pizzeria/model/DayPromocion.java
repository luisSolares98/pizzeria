package com.pizzeria.model;

import lombok.Data;

@Data
public class DayPromocion {
    String day;
    String promocion;

    public DayPromocion(String day, String promocion) {
        this.day = day;
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return day + '\'' + "," + promocion;
    }
}
