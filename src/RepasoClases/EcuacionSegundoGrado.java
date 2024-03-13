package RepasoClases;

public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setCoeficientes(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public boolean discriminantePositivo() {
        return getDiscriminante() > 0;
    }

    public double[] calcularSoluciones() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            double x1 = (-this.b + Math.sqrt(discriminante)) / (2 * this.a);
            double x2 = (-this.b - Math.sqrt(discriminante)) / (2 * this.a);
            return new double[]{x1, x2};
        } else if (discriminante == 0) {
            double x = -this.b / (2 * this.a);
            return new double[]{x};
        } else {
            return new double[]{};
        }
    }
}
