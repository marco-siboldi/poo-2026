package ar.edu.unlu.poo.clase06.ejercicio01_tienda;

public abstract class Prenda {
    private String nombre;
    private double precioBase;

    public Prenda(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return getPrecioBase();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
