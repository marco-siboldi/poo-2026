package ar.edu.unlu.poo.clase05.ejercicio03_mercado;

import java.util.HashMap;
import java.util.Map;

public class Mercado {
    private final Map<String, Double> cotizaciones;

    public Mercado (){
        this.cotizaciones = new HashMap<>();
    }

    public void actualizarCotizacion(String divisa, double valorEnUSD) {
        if(valorEnUSD <= 0){
            throw new IllegalArgumentException("El valor en USD debe ser mayor a 0.");
        }
        this.cotizaciones.put(divisa, valorEnUSD);
    }

    public double getCotizacion(String divisa) {
        return this.cotizaciones.get(divisa);
    }
}
