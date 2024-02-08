package romeroLopezMiguelAngel.Ejercicio3;

public class Ejercicio3 {
    public static void main() {

        Guerrero guerrero = new Guerrero("Guerrero", 1);
        System.out.println("Estado inicial del Guerrero:");
        guerrero.imprimirInformacion();
        guerrero.subirDeNivel();

        Mago mago = new Mago("Mago", 1);
        System.out.println("\nEstado inicial del Mago:");
        mago.imprimirInformacion();
        mago.subirDeNivel();

        Defensor defensor = new Defensor("Defensor", 1);
        System.out.println("\nEstado inicial del Defensor:");
        defensor.imprimirInformacion();
        defensor.subirDeNivel();

        System.out.println("\nCambio de clase de Guerrero a Mago:");
        guerrero.cambioDeClase("Mago");
        guerrero.imprimirInformacion();
    }
}
