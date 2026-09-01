package ar.edu.unlu.poo.clase01.ejercicio02_playlist;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    public Cancion(String titulo, String artista, int duracion) {
        if (duracion <= 0) {
            throw new DuracionInvalidaException("La duración debe ser mayor a cero.");
        }
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }
    public int getDuracion() {
        return duracion;
    }


}
