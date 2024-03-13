package RepasoClases;

public class Calendario {
    private int año;
    private int mes;
    private int dia;

    public Calendario(int año, int mes, int dia) {
        if (validarFecha(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha incorrecta.");
        }
    }

    private boolean validarFecha(int año, int mes, int dia) {
        if (año < 0 || mes < 1 || mes > 12) {
            return false;
        }
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dia < 1 || dia > diasPorMes[mes]) {
            return false;
        }
        return true;
    }

    public void incrementarDia() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dia < diasPorMes[mes]) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                año++;
            }
        }
    }

    public void incrementarMes() {
        if (mes < 12) {
            mes++;
        } else {
            mes = 1;
            año++;
        }
    }

    public void incrementarAño(int cantidad) {
        if (año + cantidad > 0) {
            año += cantidad;
        } else {
            System.out.println("El año 0 no existió.");
        }
    }

    public void mostrar() {
        System.out.println(año + "/" + mes + "/" + dia);
    }

    public boolean iguales(Calendario otraFecha) {
        return (this.año == otraFecha.año) && (this.mes == otraFecha.mes) && (this.dia == otraFecha.dia);
    }

    public static void main(String[] args) {
        Calendario fecha1 = new Calendario(2022, 5, 15);
        fecha1.mostrar();
        fecha1.incrementarDia();
        fecha1.mostrar();
        fecha1.incrementarMes();
        fecha1.mostrar();
        fecha1.incrementarAño(1);
        fecha1.mostrar();

        Calendario fecha2 = new Calendario(2022, 5, 15);
        System.out.println("¿Fecha1 y Fecha2 son iguales? " + fecha1.iguales(fecha2));
    }
}
