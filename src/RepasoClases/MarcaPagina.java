package RepasoClases;

public class MarcaPagina {
    private int paginaActual;
    private int ultimaPaginaLeida;

    public MarcaPagina() {
        this.paginaActual = 0;
        this.ultimaPaginaLeida = 0;
    }

    public void incrementarPaginaLeida() {
        this.ultimaPaginaLeida = this.paginaActual;
        this.paginaActual++;
    }

    public int obtenerUltimaPaginaLeida() {
        return this.ultimaPaginaLeida;
    }

    public void comenzarNuevaLectura() {
        this.paginaActual = 0;
        this.ultimaPaginaLeida = 0;
    }
}
