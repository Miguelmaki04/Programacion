package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Ej_clase4 {


    class OrdenDecreciente implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            return num2.compareTo(num1);
        }
    }

    public class Main {
        public void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                numeros.add(random.nextInt(100) + 1);
            }

            System.out.println("Números generados:");
            System.out.println(numeros);

            Collections.sort(numeros, new OrdenDecreciente());

            System.out.println("Números ordenados en sentido decreciente:");
            System.out.println(numeros);
        }
    }

}
