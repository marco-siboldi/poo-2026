package ar.edu.unlu.poo.clase01.ejercicio00_temperatura;

public class Temperatura {
    public static final double CERO_ABSOLUTO_CELSIUS = -273.15;
    private double valorCelsius;

    public Temperatura(double valorCelsius) {
        if (valorCelsius < CERO_ABSOLUTO_CELSIUS) {
            throw new IllegalArgumentException("Temperatura físicamente imposible. " +
                    "No puede ser menor al cero absoluto (" + CERO_ABSOLUTO_CELSIUS + " °C).");
        }
        this.valorCelsius = valorCelsius;
    }

    //getter para leer el valor en Celsius
    public double getValorCelsius() {
        return valorCelsius;
    }

    public double aFahrenheit() {
        return (valorCelsius * 1.8) + 32;
    }

}
