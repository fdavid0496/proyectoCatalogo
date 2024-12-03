package org.davles.proyectocatalogo.models;

import org.davles.proyectocatalogo.interfaces.IElectronico;

abstract  public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + "fabricante='" + fabricante + '\'' + "\n";
    }
}
