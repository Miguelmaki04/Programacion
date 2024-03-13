package RepasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorTexto {

    public static void main(String[] args) {
        String nombreArchivo = "carta.txt";
        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                caracteres += linea.length();
                lineas++;
                palabras += linea.trim().isEmpty() ? 0 : linea.trim().split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Número de caracteres: " + caracteres);
        System.out.println("Número de líneas: " + lineas);
        System.out.println("Número de palabras: " + palabras);
    }
}
