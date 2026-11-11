package ar.edu.unlu.poo.clase06.ejercicio03_flota;

public class Camioneta extends Vehiculo {
    private final double kgCarga;
    private static final double RECARGO_POR_KG = 10.0;

    public Camioneta(double tarifaDiariaEstandar, double kilogramos) {
        super(tarifaDiariaEstandar);
        if(kilogramos < 0) {
            throw new IllegalArgumentException("El peso de la carga no puede ser negativo");
        }
        this.kgCarga = kilogramos;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifaBase = super.calcularTarifa(dias);
        double recargoPorCarga = kgCarga * RECARGO_POR_KG;
        return tarifaBase + recargoPorCarga;
    }
}


