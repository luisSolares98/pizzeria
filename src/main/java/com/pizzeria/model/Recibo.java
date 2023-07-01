package com.pizzeria.model;

import lombok.Data;

@Data
public class Recibo {
    String fecha;
    DayPromocion promo;
    Pizza pizza;
}
