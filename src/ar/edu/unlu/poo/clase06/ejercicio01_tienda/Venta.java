package ar.edu.unlu.poo.clase06.ejercicio01_tienda;

import java.util.List;
import java.util.ArrayList;

public class Venta {

    private final List<Prenda> prendasVendidas;

    public Venta() {
        this.prendasVendidas = new java.util.ArrayList<>();
    }

    public double calcularTotal() {
        double precioFinalTotal = 0.0;
        for (Prenda prenda : prendasVendidas) {
            precioFinalTotal += prenda.calcularPrecioFinal();
        }
        return precioFinalTotal;
    }

    public void agregarPrenda(Prenda prenda) {
        prendasVendidas.add(prenda);
    }
}
