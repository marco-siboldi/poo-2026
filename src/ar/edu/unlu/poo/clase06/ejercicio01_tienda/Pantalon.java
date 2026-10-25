package ar.edu.unlu.poo.clase06.ejercicio01_tienda;

public class Pantalon extends Prenda {
    private boolean esDeTemporadaAnterior;
    private static final double DESCUENTO_TEMPORADA_ANTERIOR = 0.1; // Descuento del 10% para pantalones de temporada anterior

    public Pantalon(String nombre, double precioBase, boolean esDeTemporadaAnterior) {
        super(nombre, precioBase);
        this.esDeTemporadaAnterior = esDeTemporadaAnterior;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = super.calcularPrecioFinal();
        if (esDeTemporadaAnterior) {
            precioFinal *= (1 - DESCUENTO_TEMPORADA_ANTERIOR);
        }
        return precioFinal;
    }


}
