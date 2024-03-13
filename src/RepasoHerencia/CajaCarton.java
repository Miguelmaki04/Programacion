package RepasoHerencia;

public class CajaCarton extends Caja {
    private static double superficieTotal = 0;  // en cm^2

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo);
        superficieTotal += 2 * (ancho * alto + alto * fondo + ancho * fondo);  // superficie de la caja
    }

    @Override
    public double getVolumen() {
        double volumenReal = super.getVolumen();
        return volumenReal * 0.8;  // el 80% del volumen real
    }

    public static double getSuperficieTotal() {
        return superficieTotal;
    }
}

