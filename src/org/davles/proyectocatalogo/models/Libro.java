package org.davles.proyectocatalogo.models;

import org.davles.proyectocatalogo.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private final Date fechaPublicacion;
    private final String autor;
    private final String titulo;
    private final String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "fechaPublicacion=" + fechaPublicacion +
                "\nautor='" + autor + '\'' +
                "\ntitulo='" + titulo + '\'' +
                "\neditorial='" + editorial + '\'';
    }
}
