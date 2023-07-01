package com.pizzeria.services;

import com.pizzeria.builder.Cocinero;
import com.pizzeria.model.Pedido;
import com.pizzeria.model.Pizza;
import com.pizzeria.builder.PizzaBuilder;
import com.pizzeria.model.Recibo;
import com.pizzeria.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class ServicePizza {
    @Autowired
    PizzaBuilder builderPizza;
    @Autowired
    Util util;

    public HashMap getListPizza() {
        return this.util.getListPizza();
    }
    public Recibo pedido(Pedido pedido) {
        Recibo recibo = new Recibo();
        recibo.setFecha(pedido.getFecha());
        recibo.setPromo(util.getPromo(pedido.getFecha()));
        recibo.setPizza(obtenerPizza(pedido.getPizza(), pedido.getOpcionPizza()));
        return recibo;
    }
    private Pizza obtenerPizza(Pizza pizza, int opcion) {
        Pizza aux = new Pizza();
        if (opcion == 0) aux = createPizza(pizza);
        if (opcion != 0) aux = prepararPizza(opcion);
        return aux;
    }
    private Pizza createPizza(Pizza pizza) {
        this.util.addPizza(pizza);
        return pizza;
    }

    private Pizza prepararPizza(int opcion) {
        builderPizza.reset();
        Cocinero cocinero = new Cocinero(builderPizza);
        switch (opcion) {
            case 1 -> cocinero.prepararPizzaAmericana();
            case 2 -> cocinero.prepararPizzaStrogonoffPollo();
            case 3 -> cocinero.prepararPizzaStrogonoffCarne();
            default -> {
                return this.util.getPizza(opcion);
            }
        }
        return builderPizza.getPizza();
    }

}
