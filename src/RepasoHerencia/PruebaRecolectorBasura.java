package RepasoHerencia;

public class PruebaRecolectorBasura {

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new MiClase();
        }
    }

    static class MiClase {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Objeto recolectado por el recolector de basura");
        }
    }
}
