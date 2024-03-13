package RepasoInterfaces;

import java.util.ArrayList;

interface Cola {
    void encolar(String elemento);
    String desencolar();
}

interface Pila {
    void apilar(String elemento);
    String desapilar();
}

public class Lista implements Cola, Pila {
    private ArrayList<String> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    // Implementación de los métodos de la interfaz Cola
    @Override
    public void encolar(String elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public String desencolar() {
        if (!this.elementos.isEmpty()) {
            return this.elementos.remove(0);
        }
        return null;
    }

    // Implementación de los métodos de la interfaz Pila
    @Override
    public void apilar(String elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public String desapilar() {
        if (!this.elementos.isEmpty()) {
            return this.elementos.remove(this.elementos.size() - 1);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "elementos=" + elementos +
                '}';
    }
}
