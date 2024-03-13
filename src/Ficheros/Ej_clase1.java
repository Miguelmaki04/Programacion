package Ficheros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_clase1 {
        public static void main(String[] args) {
            int entero = leerEntero();
            System.out.println("Entero ingresado: " + entero);
        }

        public static int leerEntero() {
            Scanner scanner = new Scanner(System.in);
            int numero = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("Ingrese un número entero: ");
                try {
                    numero = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: No ha ingresado un número entero válido.");
                    scanner.next();
                }
            }

            return numero;
        }
    }



