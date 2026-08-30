package ar.edu.unlu.poo.clase01.ejercicio00_temperatura;

public class Main {
    public static void main(String[] args) {
        Temperatura unaTemperatura = new Temperatura(20.0);
        ReporteMeteorologico unReporte = new ReporteMeteorologico(unaTemperatura, "Buenos Aires");
        System.out.println(unReporte.mostrarTemperaturaCiudad());
        System.out.println(unReporte.mostrarTemperaturaFahrenheitCiudad());

        Temperatura otraTemperatura = new Temperatura(-20.0);
        ReporteMeteorologico otroReporte = new ReporteMeteorologico(otraTemperatura, "Nevada");
        System.out.println(otroReporte.mostrarTemperaturaFahrenheitCiudad());

        try {
            Temperatura imposible = new Temperatura(-300.0);
            System.out.println(imposible.getValorCelsius());
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear la temperatura: " + e.getMessage());
        }
    }
}
