package ar.edu.unlu.poo.clase06.ejercicio01_tienda;

public class Remera extends Prenda {
    private boolean importada;
    private static final double RECARGO_IMPORTADA = 5000; // Recargo fijo de $5.000 para remeras importadas

    public Remera(String nombre, double precioBase, boolean importada) {
        super(nombre, precioBase);
        this.importada = importada;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = super.calcularPrecioFinal();
        if (importada) {
            precioFinal += RECARGO_IMPORTADA;
        }
        return precioFinal;
    }

}
