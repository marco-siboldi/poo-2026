package ar.edu.unlu.poo.clase01.ejercicio03_historial;

public class PaginaWeb {
    private String URL;
    private String titulo;

    public PaginaWeb(String URL, String titulo) {
        this.URL = URL;
        this.titulo = titulo;
    }

    public String getURL() {
        return URL;
    }

    public String getTitulo() {
        return titulo;
    }


}
