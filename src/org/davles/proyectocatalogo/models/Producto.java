package org.davles.proyectocatalogo.models;

import org.davles.proyectocatalogo.interfaces.IProducto;

abstract public class Producto implements IProducto {
    private final int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "precio=" + precio+ "\n";
    }
}
