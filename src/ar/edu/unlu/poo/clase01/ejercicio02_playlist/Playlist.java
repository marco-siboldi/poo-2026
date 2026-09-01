package ar.edu.unlu.poo.clase01.ejercicio02_playlist;

public class Playlist {
    private NodoCancion primeraCancion;
    private NodoCancion ultimaCancion;
    private int numeroCanciones;
    private double duracionTotal;
    private final String nombre;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.primeraCancion = null;
        this.ultimaCancion = null;
        this.numeroCanciones = 0;
        this.duracionTotal = 0;
    }

    public void agregarCancion(Cancion cancion) {
        NodoCancion nuevoNodo = new NodoCancion(cancion);
        if (primeraCancion == null) {
            primeraCancion = nuevoNodo;
            ultimaCancion = nuevoNodo;
        } else {
            ultimaCancion.setSiguienteCancion(nuevoNodo);
            ultimaCancion = nuevoNodo;
        }
        numeroCanciones++;
        duracionTotal += cancion.getDuracion();
    }

    public Cancion reproducirSiguiente(){
        if(primeraCancion == null){
            throw new PlaylistVaciaException("No se puede reproducir siguiente en una playlist vacía.");
        }
        Cancion cancion = primeraCancion.getCancion();
        primeraCancion = primeraCancion.getSiguienteCancion();
        if(primeraCancion == null){
            ultimaCancion = null;
        }
        duracionTotal -= cancion.getDuracion();
        numeroCanciones--;
        return cancion;
    }

    public int getCantidadCanciones() {
        return numeroCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaVacia(){
        return numeroCanciones == 0;
    }

    public double obtenerDuracionTotal() {
        return duracionTotal;
    }


}
