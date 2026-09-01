package ar.edu.unlu.poo.clase01.ejercicio02_playlist;

class NodoCancion {
    private Cancion cancion;
    private NodoCancion siguienteCancion;

    public NodoCancion(Cancion nodoCancion) {
        this.cancion = nodoCancion;
        this.siguienteCancion = null;
    }

    public Cancion getCancion() {
        return cancion;
    }
    public NodoCancion getSiguienteCancion() {
        return siguienteCancion;
    }
    public void setSiguienteCancion(NodoCancion siguienteCancion) {
        this.siguienteCancion = siguienteCancion;
    }
}
