package com.pizzeria.builder;

import com.pizzeria.model.Pizza;

public class Cocinero {
    PizzaBuilder builder;

    public Cocinero(PizzaBuilder builder) {
        this.builder = builder;
    }
    public Pizza prepararPizzaAmericana() {
        builder.reset();
        builder.addNombre("Pizza Americana");
        builder.addQueso();
        builder.addTomate();
        builder.addMortadela();
        return builder.getPizza();
    }
    public Pizza prepararPizzaStrogonoffPollo() {
        builder.reset();
        builder.addNombre("Pizza Strogonoff Pollo");
        builder.addQueso();
        builder.addTomate();
        builder.addPollo();
        builder.addPapas();
        return builder.getPizza();
    }
    public Pizza prepararPizzaStrogonoffCarne() {
        builder.reset();
        builder.addNombre("Pizza Strogonoff Carne");
        builder.addQueso();
        builder.addTomate();
        builder.addCarne();
        builder.addPapas();
        return builder.getPizza();
    }
}
