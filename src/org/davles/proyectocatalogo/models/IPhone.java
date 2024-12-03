package org.davles.proyectocatalogo.models;

public class IPhone extends Electronico {
    private final String modelo;
    private final String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.8;
    }

    @Override
    public String toString() {
        return super.toString() +
                "modelo='" + modelo + '\'' +
                "\ncolor='" + color + '\'';
    }
}
