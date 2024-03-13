package RepasoHerencia;

public class Caja {
    private int ancho;
    private int alto;
    private int fondo;
    private Unidad unidad;
    private String etiqueta;

    public Caja(int ancho, int alto, int fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen() {
        double volumen = (double) ancho * alto * fondo;
        if (unidad == Unidad.CM) {
            volumen = volumen / (100 * 100 * 100);  // convertir cm^3 a m^3
        }
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            System.out.println("La etiqueta no puede tener más de 30 caracteres.");
        } else {
            this.etiqueta = etiqueta;
        }
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", unidad=" + unidad +
                ", etiqueta='" + etiqueta + '\'' +
                '}';
    }

    public enum Unidad {
        CM,
        M
    }
}

