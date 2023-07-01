package com.pizzeria.controller;

import com.pizzeria.model.Pedido;
import com.pizzeria.model.Recibo;
import com.pizzeria.services.ServicePizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("pizza")
public class ControllerPizza {
    @Autowired
    ServicePizza servicePizza;
    @PostMapping("/")
    public Recibo registroPedido(@RequestBody Pedido pedido) {
        return servicePizza.pedido(pedido);
    }
    @GetMapping("/")
    public HashMap getPizzas() {
        return servicePizza.getListPizza();
    }
}
