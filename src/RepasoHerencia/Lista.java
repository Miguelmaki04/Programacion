package RepasoHerencia;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Integer> elementos;

    // Constructor
    public Lista() {
        this.elementos = new ArrayList<>();
    }

    // Método equals para comparar dos listas
    public boolean equals(Lista otraLista) {
        if (this.elementos.size() != otraLista.elementos.size()) {
            return false;
        }

        for (int i = 0; i < this.elementos.size(); i++) {
            if (!this.elementos.get(i).equals(otraLista.elementos.get(i))) {
                return false;
            }
        }

        return true;
    }

    // Otros métodos de la clase Lista
    public void agregarElemento(int elemento) {
        this.elementos.add(elemento);
    }

    public void imprimirElementos() {
        for (int elemento : this.elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.agregarElemento(1);
        lista1.agregarElemento(2);
        lista1.agregarElemento(3);

        Lista lista2 = new Lista();
        lista2.agregarElemento(1);
        lista2.agregarElemento(2);
        lista2.agregarElemento(3);

        System.out.println("Lista 1:");
        lista1.imprimirElementos();

        System.out.println("Lista 2:");
        lista2.imprimirElementos();

        if (lista1.equals(lista2)) {
            System.out.println("Las listas son iguales.");
        } else {
            System.out.println("Las listas son diferentes.");
        }
    }
}
