package com.pizzeria.utils;

import com.pizzeria.model.DayPromocion;
import com.pizzeria.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service
public class Util {
    private HashMap<Integer, String> listPizza;
    private HashMap<Integer, Pizza> constructorPizza;
    private DayPromocion[] listDay;

    public Util() {
        this.listDay = new DayPromocion[7];
        this.listPizza = new HashMap<>();
        this.constructorPizza = new HashMap<>();
        init();
    }

    private void init() {
        // LIST PIZZAS
        this.listPizza.put(0, "Pizza Personalizada");
        this.listPizza.put(1, "Pizza Americana");
        this.listPizza.put(2, "Pizza Strogonoff Pollo");
        this.listPizza.put(3, "Pizza Strogonoff Carne");

        // LIST DIAS
        listDay[0] = new DayPromocion("Domingo", "Sin Promo");
        listDay[1] = new DayPromocion("lunes", "Sin Promo");
        listDay[2] = new DayPromocion("Martes", "Promo 2x1");
        listDay[3] = new DayPromocion("Miercoles", "Promo 2x1");
        listDay[4] = new DayPromocion("Jueves", "Delivery Free");
        listDay[5] = new DayPromocion("Viernes", "Sin Promo");
        listDay[6] = new DayPromocion("Sabado", "Sin Promo");
    }
    public DayPromocion getPromo(String fecha) {
        Date date= new Date(fecha);
        return listDay[date.getDay()];
    }
    public HashMap getListPizza() {
        return this.listPizza;
    }
    public Pizza getPizza(int key) {
        return this.constructorPizza.get(key);
    }
    public void addPizza( Pizza pizza) {
        int lastInsert = this.listPizza.size();
        this.listPizza.put(lastInsert, pizza.getNombre());
        this.constructorPizza.put(lastInsert, pizza);
    }
}
