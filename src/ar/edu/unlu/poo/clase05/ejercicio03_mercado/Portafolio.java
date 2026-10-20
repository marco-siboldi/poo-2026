package ar.edu.unlu.poo.clase05.ejercicio03_mercado;

import java.util.HashMap;
import java.util.Map;

public class Portafolio {

    private final Mercado mercado;
    private final Map<String, Double> posiciones;

    public Portafolio(Mercado mercado) {
        if(mercado == null){
            throw new IllegalArgumentException("El mercado no puede ser nulo.");
        }
        this.mercado = mercado;
        this.posiciones = new HashMap<>();
    }

    public void agregarPosicion(String divisa, double cantidad) {
        if(cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        }
        this.posiciones.put(divisa, cantidad + getPosicion(divisa));
    }

    public double getPosicion(String divisa) {
        return this.posiciones.getOrDefault(divisa, 0.0);
    }
}
