package org.davles.proyectocatalogo.models;

import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() + "personaje='" + personaje + '\'';
    }
}
