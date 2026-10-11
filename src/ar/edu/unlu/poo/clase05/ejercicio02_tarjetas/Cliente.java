package ar.edu.unlu.poo.clase05.ejercicio02_tarjetas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private String nombre;
    private final String dni;
    private final List<Tarjeta> tarjetas;

    public Cliente(String dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetas = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }

    public List<Tarjeta> getTarjetas() {
        return Collections.unmodifiableList(tarjetas);
    }

    void agregarTarjeta(Tarjeta nuevaTarjeta) {
        this.tarjetas.add(nuevaTarjeta);
    }
}
