package ar.edu.unlu.poo.clase01.ejercicio01_automotor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 01 Automotor");
        Motor unMotor = new Motor(2, 4);
        Viaje unViaje = new Viaje(unMotor, 100);
        System.out.println("Durante el viaje se consumieron: " + unViaje.calcularConsumoTotal() +
                " litros de combustible en el recorrido de " + unViaje.getDistanciaEnKm() + " Kilómetros.");
    }
}
