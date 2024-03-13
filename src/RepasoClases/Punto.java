package RepasoClases;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanciaEuclidiana(Punto otro) {
        double distancia = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
        return distancia;
    }

    public void mostrar() {
        System.out.println("Punto: (" + this.x + ", " + this.y + ")");
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(3.0, 4.0);
        Punto punto2 = new Punto(6.0, 8.0);

        punto1.mostrar();
        punto2.mostrar();

        punto1.desplaza(1.0, 2.0);
        punto1.mostrar();

        double distancia = punto1.distanciaEuclidiana(punto2);
        System.out.println("Distancia entre punto1 y punto2: " + distancia);
    }
}