package com.pizzeria.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Pizza {
    private String nombre;
    private boolean queso;
    private boolean pollo;
    private boolean pinia;
    private boolean carne;
    private boolean cebolla;
    private boolean tomate;
    private boolean papas;
    private boolean champinio;
    private boolean mortadela;
}
