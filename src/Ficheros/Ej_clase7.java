package Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Ej_clase7 {
    public static void main(String[] args) {
        String texto = "Vida antes que muerte. Fuerza antes que debilidad. Viaje antes que destino - Brandon Sanderson, El camino de los reyes.";

        // Autor y obra a rellenar carácter a carácter
        String autor = "Brandon Sanderson";
        String obra = "El camino de los reyes";

        // Ruta del archivo donde se guardará el texto
        String rutaArchivo = "texto_guardado.txt";

        try {
            FileWriter escritor = new FileWriter(rutaArchivo);

            // Escribir el texto en el archivo
            escritor.write(texto + "\n");
            escritor.write("Autor: ");
            for (char c : autor.toCharArray()) {
                escritor.write(c);
                escritor.write(" ");
            }
            escritor.write("\nObra: ");
            for (char c : obra.toCharArray()) {
                escritor.write(c);
                escritor.write(" ");
            }

            escritor.close();
            System.out.println("El texto se ha guardado en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el texto en el archivo.");
            e.printStackTrace();
        }
    }
}