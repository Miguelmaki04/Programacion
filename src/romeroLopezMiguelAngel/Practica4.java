package romeroLopezMiguelAngel;

import romeroLopezMiguelAngel.Ejercicio2.Ejercicio2;
import romeroLopezMiguelAngel.Ejercicio3.Ejercicio3;

import java.util.Scanner;

class Practica4 {

    static void ejercicio1(){
        
    }

    static void ejercicio2(){
        Ejercicio2.main();
    }

    static void ejercicio3(){
        Ejercicio3.main();
        }


    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default ->
                    System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }


        }


    }

}
