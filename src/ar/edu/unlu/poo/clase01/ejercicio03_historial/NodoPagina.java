package ar.edu.unlu.poo.clase01.ejercicio03_historial;

class NodoPagina {
    private PaginaWeb pagina;
    private NodoPagina paginaAnterior;

    public  NodoPagina(PaginaWeb pagina,  NodoPagina paginaAnterior) {
        this.paginaAnterior = paginaAnterior;
        this.pagina = pagina;
    }

    public PaginaWeb getPagina() {
        return pagina;
    }

    public NodoPagina getPaginaAnterior() {
        return paginaAnterior;
    }
}
