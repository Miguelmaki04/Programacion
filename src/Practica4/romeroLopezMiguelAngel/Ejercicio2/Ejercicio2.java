package Practica4.romeroLopezMiguelAngel.Ejercicio2;

public class Ejercicio2 {
    public static void main() {
        Peon peonBlanco = new Peon(Pieza.Color.BLANCO, 2, 2);
        peonBlanco.movimiento(3, 2);
        peonBlanco.imprimirInformacion(); // Llamada agregada

        Torre torreNegra = new Torre(Pieza.Color.NEGRO, 8, 1);
        torreNegra.movimiento(5, 1);
        torreNegra.imprimirInformacion(); // Llamada agregada

        Caballo caballoBlanco = new Caballo(Pieza.Color.BLANCO, 1, 2);
        caballoBlanco.movimiento(3, 1);
        caballoBlanco.imprimirInformacion(); // Llamada agregada
    }
}
