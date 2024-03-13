package RepasoInterfaces;

public class Jornada implements Comparable<Jornada> {
    private String dni;
    private String fecha;
    private int horaEntrada;
    private int minEntrada;
    private int horaSalida;
    private int minSalida;

    public Jornada(String dni, String fecha, int horaEntrada, int minEntrada, int horaSalida, int minSalida) {
        this.dni = dni;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.minEntrada = minEntrada;
        this.horaSalida = horaSalida;
        this.minSalida = minSalida;
    }

    public long calcularMinutosTrabajados() {
        int totalMinEntrada = horaEntrada * 60 + minEntrada;
        int totalMinSalida = horaSalida * 60 + minSalida;
        return totalMinSalida - totalMinEntrada;
    }

    @Override
    public int compareTo(Jornada otraJornada) {
        if (this.dni.equals(otraJornada.dni)) {
            return this.fecha.compareTo(otraJornada.fecha);
        }
        return this.dni.compareTo(otraJornada.dni);
    }

    @Override
    public String toString() {
        long minutosTrabajados = calcularMinutosTrabajados();
        return "DNI: " + dni + ", Fecha: " + fecha + ", Duración en minutos: " + minutosTrabajados;
    }

    public static void main(String[] args) {
        Jornada jornada1 = new Jornada("12345678A", "2022-09-15", 9, 0, 17, 30);
        Jornada jornada2 = new Jornada("12345678A", "2022-09-16", 8, 45, 18, 15);

        System.out.println(jornada1);
        System.out.println(jornada2);
    }
}