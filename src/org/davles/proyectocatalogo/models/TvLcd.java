package org.davles.proyectocatalogo.models;

public class TvLcd extends Electronico {
    private final int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio() * 1.4;
    }

    @Override
    public String toString() {
        return super.toString() + "pulgada=" + pulgada;
    }
}
