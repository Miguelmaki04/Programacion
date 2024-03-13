package RepasoClases;

import java.util.Random;
import java.util.Arrays;

public class Colores {
    private String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja"};
    private Random random = new Random();

    public String[] elegirColoresAlAzar(int n) {
        if (n > colores.length) {
            return null; // No hay suficientes colores
        }

        String[] coloresElegidos = new String[n];

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(colores.length);
            String color = colores[index];
            coloresElegidos[i] = color;
            // Eliminar el color seleccionado para que no se repita
            colores[index] = colores[colores.length - 1];
            colores = Arrays.copyOf(colores, colores.length - 1);
        }

        return coloresElegidos;
    }

    public static void main(String[] args) {
        Colores paleta = new Colores();

        String[] coloresElegidos = paleta.elegirColoresAlAzar(3);
        System.out.println("Colores elegidos al azar:");
        for (String color : coloresElegidos) {
            System.out.println(color);
        }
    }
}