package RepasoHerencia;

public class Operaciones {

    public static boolean esNumero(Object ob) {
        try {
            Double.parseDouble(ob.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void sumar(Object a, Object b) {
        if (a instanceof Number && b instanceof Number) {
            Double suma = Double.parseDouble(a.toString()) + Double.parseDouble(b.toString());
            System.out.println(suma);
        } else if (a instanceof String && b instanceof String) {
            System.out.println((String) a + (String) b);
        } else {
            System.out.println("No sumables");
        }
    }
}
