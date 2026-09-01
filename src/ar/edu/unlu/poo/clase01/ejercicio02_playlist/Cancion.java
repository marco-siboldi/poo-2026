package ar.edu.unlu.poo.clase01.ejercicio02_playlist;

public class Cancion {
    private String nombre;
    private String artista;
    private double duracion;

    public Cancion(String nombre, String artista, double duracion) {
        if (duracion <= 0) {
            throw new DuracionInvalidaException("La duración debe ser mayor a cero.");
        }
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }
    public double getDuracion() {
        return duracion;
    }


}
