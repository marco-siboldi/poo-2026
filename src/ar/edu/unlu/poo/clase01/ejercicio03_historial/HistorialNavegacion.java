package ar.edu.unlu.poo.clase01.ejercicio03_historial;

public class HistorialNavegacion {
    private NodoPagina tope;
    private int cantidad;

    public HistorialNavegacion() {
        this.tope = null;
        this.cantidad = 0;
    }


    public void visitarPagina(PaginaWeb pagina){
        this.tope = new NodoPagina(pagina,tope);
        this.cantidad++;

    }

    public PaginaWeb retrocederPagina() {

        if (this.tope==null){
            throw new HistorialVacioException("Historial vacío.");
        }

        PaginaWeb pagina = tope.getPagina();

        this.tope = tope.getPaginaAnterior();
        this.cantidad--;

        return pagina;

    }

    public boolean estaVacio() {
        return this.cantidad == 0;
    }

    public int getCantidadPaginas(){
        return this.cantidad;
    }

}
