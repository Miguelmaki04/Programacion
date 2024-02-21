package Interfaces;

public class Ej_clase {
        private Integer[] elementos;
        private int tamaño;

        public Ej_clase() {
            this.elementos = new Integer[0];
            this.tamaño = 0;
        }

        public int obtenerTamaño() {
            return tamaño;
        }

        public void insertarAlFinal(Integer numero) {
            redimensionar(tamaño + 1);
            elementos[tamaño - 1] = numero;
        }

        public void insertarAlPrincipio(Integer numero) {
            redimensionar(tamaño + 1);
            for (int i = tamaño - 1; i > 0; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[0] = numero;
        }

        public void insertarEnIndice(int indice, Integer numero) {
            if (indice >= 0 && indice <= tamaño) {
                redimensionar(tamaño + 1);
                for (int i = tamaño - 1; i > indice; i--) {
                    elementos[i] = elementos[i - 1];
                }
                elementos[indice] = numero;
            } else {
                System.out.println("Índice fuera de rango.");
            }
        }

        public void añadirLista(Ej_clase otraLista) {
            for (int i = 0; i < otraLista.obtenerTamaño(); i++) {
                insertarAlFinal(otraLista.obtenerElemento(i));
            }
        }

        public void eliminarEnIndice(int indice) {
            if (indice >= 0 && indice < tamaño) {
                for (int i = indice; i < tamaño - 1; i++) {
                    elementos[i] = elementos[i + 1];
                }
                redimensionar(tamaño - 1);
            } else {
                System.out.println("Índice fuera de rango.");
            }
        }

        public Integer obtenerElemento(int indice) {
            if (indice >= 0 && indice < tamaño) {
                return elementos[indice];
            } else {
                System.out.println("Índice fuera de rango.");
                return null;
            }
        }

        public int buscar(Integer numero) {
            for (int i = 0; i < tamaño; i++) {
                if (elementos[i].equals(numero)) {
                    return i;
                }
            }
            return -1;
        }

        public void mostrar() {
            for (int i = 0; i < tamaño; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }

        private void redimensionar(int nuevoTamaño) {
            Integer[] nuevaLista = new Integer[nuevoTamaño];
            int copiarElementos = Math.min(tamaño, nuevoTamaño);
            System.arraycopy(elementos, 0, nuevaLista, 0, copiarElementos);
            elementos = nuevaLista;
            tamaño = nuevoTamaño;
        }

        public static void main(String[] args) {
            Ej_clase lista = new Ej_clase();
            lista.insertarAlFinal(5);
            lista.insertarAlFinal(10);
            lista.insertarAlFinal(15);
            lista.mostrar();
            lista.insertarAlPrincipio(1);
            lista.mostrar();
            lista.insertarEnIndice(2, 7);
            lista.mostrar();
            Ej_clase otraLista = new Ej_clase();
            otraLista.insertarAlFinal(20);
            otraLista.insertarAlFinal(25);
            lista.añadirLista(otraLista);
            lista.mostrar();
            lista.eliminarEnIndice(3);
            lista.mostrar();
            System.out.println("El elemento 7 está en el índice: " + lista.buscar(7));
        }
    }


