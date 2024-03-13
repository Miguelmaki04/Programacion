package RepasoInterfaces;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
    private String dni;
    private String nombre;
    private int edad;
    private int numeroDeGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroDeGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeGoles = numeroDeGoles;
    }

    // Getters y setters omitidos por brevedad

    @Override
    public String toString() {
        return "Futbolista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numeroDeGoles=" + numeroDeGoles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return dni.equals(that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Futbolista o) {
        return this.dni.compareTo(o.dni);
    }
}

