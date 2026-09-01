package ar.edu.unlu.poo.clase01.ejercicio02_playlist;

public class Main {
    public static void main(String[] args) {
        Playlist unaPlaylist = new Playlist("Mi Playlist");
        System.out.println("Recién creada -> vacía: " + unaPlaylist.estaVacia()
                + " | canciones: " + unaPlaylist.getCantidadCanciones()
                + " | duración: " + unaPlaylist.obtenerDuracionTotal());

        Cancion cancion1 = new Cancion("Cancion 1", "Artista 1", 300);
        Cancion cancion2 = new Cancion("Cancion 2", "Artista 2", 450);
        Cancion cancion3 = new Cancion("Cancion 3", "Artista 3", 250);
        unaPlaylist.agregarCancion(cancion1);
        unaPlaylist.agregarCancion(cancion2);
        unaPlaylist.agregarCancion(cancion3);

        try {
            new Cancion("Cancion 4", "Artista 4", 0);
        } catch (DuracionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Duración total de la playlist: " + unaPlaylist.obtenerDuracionTotal());
        System.out.println("Cantidad de canciones en la playlist: " + unaPlaylist.getCantidadCanciones());

        Cancion primeraReproducida = unaPlaylist.reproducirSiguiente();
        System.out.println("Cancion reproducida: " + primeraReproducida.getTitulo()
                + " | quedan: " + unaPlaylist.getCantidadCanciones()
                + " | duración: " + unaPlaylist.obtenerDuracionTotal());

        Cancion segundaReproducida = unaPlaylist.reproducirSiguiente();
        System.out.println("Cancion reproducida: " + segundaReproducida.getTitulo());

        Cancion terceraReproducida = unaPlaylist.reproducirSiguiente();
        System.out.println("Cancion reproducida: " + terceraReproducida.getTitulo());

        System.out.println("Al final -> vacía: " + unaPlaylist.estaVacia()
                + " | canciones: " + unaPlaylist.getCantidadCanciones()
                + " | duración: " + unaPlaylist.obtenerDuracionTotal());

        try {
            unaPlaylist.reproducirSiguiente();
        } catch (PlaylistVaciaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
