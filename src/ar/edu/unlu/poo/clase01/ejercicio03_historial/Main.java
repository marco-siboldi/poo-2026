package ar.edu.unlu.poo.clase01.ejercicio03_historial;

public class Main {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        System.out.println("Recién creado -> vacío: " + historial.estaVacio()
                + " | páginas: " + historial.getCantidadPaginas());

        PaginaWeb pagina1 = new PaginaWeb("https://youtube.com", "Youtube");
        PaginaWeb pagina2 = new PaginaWeb("https://instagram.com", "Instagram");
        PaginaWeb pagina3 = new PaginaWeb("https://facebook.com", "Facebook");

        historial.visitarPagina(pagina1);
        historial.visitarPagina(pagina2);
        historial.visitarPagina(pagina3);
        System.out.println("Tras 3 visitas -> vacío: " + historial.estaVacio()
                + " | páginas: " + historial.getCantidadPaginas());

        // Al retroceder deben salir en orden inverso al de visita (LIFO)
        PaginaWeb primeraRetrocedida = historial.retrocederPagina();
        System.out.println("Retrocedí a: " + primeraRetrocedida.getTitulo()
                + " (" + primeraRetrocedida.getURL() + ")"
                + " | quedan: " + historial.getCantidadPaginas());

        PaginaWeb segundaRetrocedida = historial.retrocederPagina();
        System.out.println("Retrocedí a: " + segundaRetrocedida.getTitulo()
                + " (" + segundaRetrocedida.getURL() + ")"
                + " | quedan: " + historial.getCantidadPaginas());

        PaginaWeb terceraRetrocedida = historial.retrocederPagina();
        System.out.println("Retrocedí a: " + terceraRetrocedida.getTitulo()
                + " (" + terceraRetrocedida.getURL() + ")"
                + " | quedan: " + historial.getCantidadPaginas());

        System.out.println("Al final -> vacío: " + historial.estaVacio()
                + " | páginas: " + historial.getCantidadPaginas());

        try {
            historial.retrocederPagina();
        } catch (HistorialVacioException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // El historial se puede seguir usando después de vaciarse
        historial.visitarPagina(pagina2);
        System.out.println("Nueva visita tras vaciar -> retrocedí a: "
                + historial.retrocederPagina().getTitulo()
                + " | vacío: " + historial.estaVacio());
    }
}
