package RepasoClases;

public class CifradoCesar {
    public static String cifrarTexto(String texto, int n) {
        String textoCifrado = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                char cifrado = (char) (((caracter - base + n) % 26) + base);
                textoCifrado += cifrado;
            } else {
                textoCifrado += caracter;
            }
        }

        return textoCifrado;
    }

    public static void main(String[] args) {
        String textoOriginal = "Hola, Mundo!";
        int desplazamiento = 3;

        String textoCifrado = cifrarTexto(textoOriginal, desplazamiento);
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto cifrado: " + textoCifrado);
    }
}