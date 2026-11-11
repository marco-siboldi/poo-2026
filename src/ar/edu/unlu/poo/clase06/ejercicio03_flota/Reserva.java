package ar.edu.unlu.poo.clase06.ejercicio03_flota;

public class Reserva {
    private final Vehiculo vehiculo;
    private final int dias;

    public Reserva(Vehiculo vehiculo, int dias) {
        if(vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if(dias <= 0) {
            throw new IllegalArgumentException("La cantidad de días debe ser mayor que cero");
        }
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularMontoTotal() {
        return vehiculo.calcularTarifa(dias);
    }

}
