package ar.edu.unlu.poo.clase01.ejercicio00_temperatura;

public class ReporteMeteorologico {
    private Temperatura unaTemperatura;
    private String unaCiudad;

    public ReporteMeteorologico(Temperatura unaTemperatura, String unaCiudad) {
        this.unaTemperatura = unaTemperatura;
        this.unaCiudad = unaCiudad;
    }

    public String mostrarTemperaturaCiudad(){
        return "La temperatura en " + unaCiudad + " es de " + unaTemperatura.getValorCelsius() + " °C.";
    }

    public String mostrarTemperaturaFahrenheitCiudad(){
        return "La temperatura en " + unaCiudad + " es de " + unaTemperatura.aFahrenheit() + " °F.";
    }
}
