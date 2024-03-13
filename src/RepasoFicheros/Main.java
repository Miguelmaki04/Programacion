package RepasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero:");
        String nombreFichero = scanner.nextLine();

        if (nombreFichero.isEmpty()) {
            nombreFichero = "prueba.txt";
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el fichero: " + e.getMessage());
        }
    }
}

