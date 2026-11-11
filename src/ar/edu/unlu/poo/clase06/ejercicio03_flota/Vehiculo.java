package ar.edu.unlu.poo.clase06.ejercicio03_flota;

public class Vehiculo {
    private final double tarifaDiariaEstandar; // Ejemplo de tarifa diaria estándar


    public Vehiculo(double tarifaDiariaEstandar) {
        if(tarifaDiariaEstandar <= 0) {
            throw new IllegalArgumentException("La tarifa diaria estándar debe ser mayor que cero.");
        }

        this.tarifaDiariaEstandar = tarifaDiariaEstandar;
    }

    public double calcularTarifa(int dias) {
        return dias * tarifaDiariaEstandar;
    }
}