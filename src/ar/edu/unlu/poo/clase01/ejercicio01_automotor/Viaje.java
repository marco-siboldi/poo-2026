package ar.edu.unlu.poo.clase01.ejercicio01_automotor;

public class Viaje {

    private final Motor unMotor;
    private final double distanciaEnKm;

    public Viaje(Motor motor, double distancia) {
        this.unMotor = motor;
        this.distanciaEnKm = distancia;
    }

    public double getDistanciaEnKm() {
        return distanciaEnKm;
    }

    public double calcularConsumoTotal() {
        return unMotor.calcularConsumo(distanciaEnKm);
    }

}
