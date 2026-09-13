package ar.edu.unlu.poo.clase02.ejercicio02_vetcare;

public class Mascota {
    private String chip;
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String codigo, String nombre, String especie, int edad) {
        this.chip = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getChip() {
        return chip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

}
