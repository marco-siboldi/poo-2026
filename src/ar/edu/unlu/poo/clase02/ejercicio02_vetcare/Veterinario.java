package ar.edu.unlu.poo.clase02.ejercicio02_vetcare;

public class Veterinario {
    private String matricula;
    private String nombre;

    public Veterinario(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;

    }

    public String getMatricula() {
        return matricula;
    }
    public String getNombre() {
        return nombre;
    }
}
