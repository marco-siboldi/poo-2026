package ar.edu.unlu.poo.clase01.ejercicio01_automotor;

public class Motor {
    private final double cilindrada;
    private final double eficiencia;
    private static final double PORCENTAJE_CILINDRADA = 0.05;
    public Motor(double cilindrada, double eficiencia) {
        this.cilindrada = cilindrada;
        this.eficiencia = eficiencia;
    }
    public double calcularConsumo(double distanciaEnKm) {
        return ((cilindrada * PORCENTAJE_CILINDRADA) + eficiencia) * (distanciaEnKm / 100);
    }
}
