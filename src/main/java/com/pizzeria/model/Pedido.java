package com.pizzeria.model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class Pedido {
    String fecha;

    int opcionPizza;

    Pizza pizza;
}
