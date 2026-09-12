package ar.edu.unlu.poo.clase02.ejercicio01_reactores;

import java.util.ArrayList;

public class TableroControl {

    private ArrayList<Reactor> reactores;
    private String nombrePlanta;

    public TableroControl(String nombre) {
        this.reactores = new ArrayList<>();
        this.nombrePlanta = nombre;
    }

    public void agregarReactor(Reactor reactor) {
        if(reactor == null){
            throw new IllegalArgumentException("Reactor no puede ser nulo.");
        }
        this.reactores.add(reactor);
    }

    public String getNombrePlanta() {
        return this.nombrePlanta;
    }
}
