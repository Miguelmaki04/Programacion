package RepasoFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ma {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Leer los números de los dos archivos
        leerNumerosDeArchivo("archivo1.txt", numeros);
        leerNumerosDeArchivo("archivo2.txt", numeros);

        // Ordenar la lista de números
        Collections.sort(numeros);

        // Guardar los números ordenados en el tercer archivo
        guardarNumerosEnArchivo("archivo3.txt", numeros);
    }

    private static void leerNumerosDeArchivo(String nombreArchivo, List<Integer> numeros) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                numeros.add(Integer.parseInt(linea));
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " + e.getMessage());
        }
    }

    private static void guardarNumerosEnArchivo(String nombreArchivo, List<Integer> numeros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Integer numero : numeros) {
                writer.write(numero.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo: " + e.getMessage());
        }
    }
}

