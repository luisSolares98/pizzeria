package com.pizzeria.builder;

import com.pizzeria.model.Pizza;
import org.springframework.stereotype.Service;

@Service
public class PizzaBuilder implements IBuilder {
    Pizza pizza;

    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void addNombre(String nombre) {
        this.pizza.setNombre(nombre);
    }

    @Override
    public void addQueso() {
        this.pizza.setQueso(true);
    }

    @Override
    public void addPollo() {
        this.pizza.setPollo(true);
    }

    @Override
    public void addPinia() {
        this.pizza.setPinia(true);
    }

    @Override
    public void addCarne() {
        this.pizza.setCarne(true);
    }

    @Override
    public void addCebolla() {
        this.pizza.setCebolla(true);
    }

    @Override
    public void addTomate() {
        this.pizza.setTomate(true);
    }

    @Override
    public void addPapas() {
        this.pizza.setPapas(true);
    }

    @Override
    public void addChampinio() {
        this.pizza.setChampinio(true);
    }

    @Override
    public void addMortadela() {
        this.pizza.setMortadela(true);
    }

    public Pizza getPizza() {
        return pizza;
    }

}
