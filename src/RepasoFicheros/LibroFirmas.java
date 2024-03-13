package RepasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibroFirmas {

    private static final String NOMBRE_ARCHIVO = "firmas.txt";

    public static void main(String[] args) {
        Set<String> firmas = cargarFirmas();
        mostrarFirmas(firmas);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un nuevo nombre para firmar: ");
        String nuevoNombre = scanner.nextLine();

        if (firmas.contains(nuevoNombre)) {
            System.out.println("El nombre ya está en el libro de firmas.");
        } else {
            firmas = firmasConNuevoNombre(firmas, nuevoNombre);
            guardarFirmas(firmas);
            System.out.println("Nombre agregado al libro de firmas con éxito.");
        }
    }

    private static Set<String> cargarFirmas() {
        Set<String> firmas = new HashSet<>();
        File archivo = new File(NOMBRE_ARCHIVO);

        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    firmas = firmasConNuevoNombre(firmas, linea);
                }
            } catch (IOException e) {
                System.out.println("Error al cargar las firmas del archivo.");
            }
        }
        return firmas;
    }

    private static Set<String> firmasConNuevoNombre(Set<String> firmas, String nuevoNombre) {
        Set<String> nuevasFirmas = new HashSet<>(firmas);
        nuevasFirmas.add(nuevoNombre);
        return nuevasFirmas;
    }

    private static void mostrarFirmas(Set<String> firmas) {
        System.out.println("Libro de Firmas:");
        for (String firma : firmas) {
            System.out.println(firma);
        }
        System.out.println("---------------------");
    }

    private static void guardarFirmas(Set<String> firmas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (String firma : firmas) {
                bw.write(firma);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las firmas en el archivo.");
        }
    }
}