package ar.edu.unlu.poo.clase02.ejercicio03_inscripciones;

public class Estudiante {
    private final Integer legajo;
    private final String nombre;

    public Estudiante(Integer legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }
    public String getNombre() {
        return nombre;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Estudiante otroEstudiante = (Estudiante) o;
        return this.legajo.equals(otroEstudiante.legajo);
    }

    @Override
    public int hashCode() {
        return legajo.hashCode();
    }

}
