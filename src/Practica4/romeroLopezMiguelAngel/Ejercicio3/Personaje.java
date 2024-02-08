package Practica4.romeroLopezMiguelAngel.Ejercicio3;

import java.util.Random;

public abstract class Personaje {
    protected String nombre;
    public int nivel;
    private int vida;
    private int[] estadisticas;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = 100;
        this.estadisticas = new int[]{10, 10, 10};
    }

    public abstract void subirDeNivel();

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Estadísticas:");
        System.out.println("Fuerza: " + estadisticas[0]);
        System.out.println("Defensa: " + estadisticas[1]);
        System.out.println("Magia: " + estadisticas[2]);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int[] getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(int[] estadisticas) {
        this.estadisticas = estadisticas;
    }

    public void cambioDeClase(String nuevaClase) {
        switch (nuevaClase) {
            case "Guerrero":
                this.estadisticas[0] += 3;
                this.estadisticas[1] += 2;
                this.estadisticas[2] -= 3;
                break;
            case "Mago":
                this.estadisticas[0] -= 3;
                this.estadisticas[1] += 1;
                this.estadisticas[2] += 4;
                break;
            case "Defensor":
                this.estadisticas[0] += 1;
                this.estadisticas[1] += 4;
                this.estadisticas[2] -= 3;
                break;
            default:
                System.out.println("Clase no valida");
        }
    }
}

class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
        this.setVida(this.getVida() + 30);
        this.getEstadisticas()[0] += 3;
        this.getEstadisticas()[1] += 2;
        this.getEstadisticas()[2] -= 3;
    }

    @Override
    public void subirDeNivel() {
        Random rand = new Random();
        int subirVida = rand.nextInt(21) + 20;
        int subirFuerza = rand.nextInt(3) + 1;
        int subirDefensa = rand.nextInt(2) + 1;
        int subirMagia = rand.nextInt(2);

        this.setVida(this.getVida() + subirVida);
        this.getEstadisticas()[0] += subirFuerza;
        this.getEstadisticas()[1] += subirDefensa;
        this.getEstadisticas()[2] -= subirMagia;

        System.out.println("El Guerrero " + this.nombre + " ha subido de nivel");
        System.out.println("Nuevas estadisticas:");
        this.imprimirInformacion();
    }
}

class Mago extends Personaje {
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
        this.setVida(this.getVida() + 20);
        this.getEstadisticas()[0] -= 3;
        this.getEstadisticas()[1] += 1;
        this.getEstadisticas()[2] += 4;
    }

    @Override
    public void subirDeNivel() {
        Random rand = new Random();
        int vidaSubir = rand.nextInt(21) + 10;
        int fuerzaSubir = rand.nextInt(2);
        int defensaSubir = rand.nextInt(2);
        int magiaSubir = rand.nextInt(5) + 2;

        this.setVida(this.getVida() + vidaSubir);
        this.getEstadisticas()[0] -= fuerzaSubir;
        this.getEstadisticas()[1] += defensaSubir;
        this.getEstadisticas()[2] += magiaSubir;

        System.out.println("El Mago " + this.nombre + " ha subido de nivel");
        System.out.println("Nuevas estadisticas:");
        this.imprimirInformacion();
    }
}

class Defensor extends Personaje {
    public Defensor(String nombre, int nivel) {
        super(nombre, nivel);
        this.setVida(this.getVida() + 50);
        this.getEstadisticas()[0] += 1;
        this.getEstadisticas()[1] += 4;
        this.getEstadisticas()[2] -= 3;
    }

    @Override
    public void subirDeNivel() {
        Random rand = new Random();
        int vidaSubir = rand.nextInt(21) + 40;
        int fuerzaSubir = rand.nextInt(3) + 1;
        int defensaSubir = rand.nextInt(3) + 2;
        int magiaSubir = rand.nextInt(2);

        this.setVida(this.getVida() + vidaSubir);
        this.getEstadisticas()[0] += fuerzaSubir;
        this.getEstadisticas()[1] += defensaSubir;
        this.getEstadisticas()[2] -= magiaSubir;

        System.out.println("El Defensor " + this.nombre + " ha subido de nivel");
        System.out.println("Nuevas estadisticas:");
        this.imprimirInformacion();
    }
}

