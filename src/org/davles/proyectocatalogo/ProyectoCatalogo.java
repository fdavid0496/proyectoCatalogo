package org.davles.proyectocatalogo;

import org.davles.proyectocatalogo.interfaces.IProducto;
import org.davles.proyectocatalogo.models.*;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[5];

        productos[0] = new IPhone(800000, "Apple", "iPhone X Pro", "Blanco");
        productos[1] = new TvLcd(500000, "LG", 50);
        productos[2] = new Libro(200000, new Date(), "J. K. Rowling", "Harry Potter", "\tBloomsbury Publishing Scholastic");
        productos[3] = new Comics(30000, new Date(), "Francisco Ibáñez", " Rúe el Percebe", "TÍO VIVO", "Ático Manolo");
        productos[4] = new TvLcd(1000000, "SAMSUNG", 60);

        for (IProducto producto : productos) {
            System.out.println("---------- " + producto.getClass().getSimpleName() + " ----------");
            System.out.println(producto);
            System.out.println("Precio venta: " + producto.getPrecioVenta());
        }
    }
}
