package com.pizzeria.utils;

import com.pizzeria.model.Pedido;

import java.util.Objects;

public class Validacion {
    public static boolean isNullEmpety(Object obj) {
        return Objects.isNull(obj) || obj.toString().trim().isEmpty();
    }
    public static boolean isCeroMenor(int num) {
        return num < 0;
    }
    public static boolean validacionPedido(Pedido pedido) {
        if (isNullEmpety(pedido.getFecha())) return true;
        if (isCeroMenor(pedido.getOpcionPizza())) return true;
        if (isNullEmpety(pedido.getFecha())) return true;
        return false;
    }
}
