package ar.edu.unlu.poo.clase06.ejercicio03_flota;

public class AutoVIP extends Vehiculo {
    private static final double COSTO_FIJO_SEGURO_PREMIUM = 50.0;

    public AutoVIP(double tarifaDiariaEstandar) {
        super(tarifaDiariaEstandar);
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifaBase = super.calcularTarifa(dias);
        return tarifaBase + COSTO_FIJO_SEGURO_PREMIUM;
    }

}