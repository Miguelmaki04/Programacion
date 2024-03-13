package RepasoFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu edad:");
        String edad = scanner.nextLine();

        try (BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt", true))) {
            out.write(nombre + ", " + edad);
            out.newLine();  // para añadir una nueva línea al final
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el fichero: " + e.getMessage());
        }
    }
}


