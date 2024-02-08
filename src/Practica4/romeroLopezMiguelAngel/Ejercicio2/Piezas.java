package Practica4.romeroLopezMiguelAngel.Ejercicio2;

abstract class Pieza {
    enum Color { BLANCO, NEGRO }

    private Color color;
    private int filaActual;
    private int columnaActual;
    private boolean estado;

    public Pieza(Color color, int filaActual, int columnaActual) {
        this.color = color;
        this.filaActual = filaActual;
        this.columnaActual = columnaActual;
        this.estado = false;
    }

    public abstract void movimiento(int filaDestino, int columnaDestino);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public void setFilaActual(int filaActual) {
        this.filaActual = filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public void setColumnaActual(int columnaActual) {
        this.columnaActual = columnaActual;
    }

    public boolean Estado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void imprimirInformacion() {
        System.out.println("Color: " + color);
        System.out.println("Fila actual: " + filaActual);
        System.out.println("Columna actual: " + columnaActual);
        System.out.println("Estado: " + (estado ? "Derrotada" : "Activa"));
    }
}

// Parte 2
class Peon extends Pieza {
    public Peon(Color color, int filaActual, int columnaActual) {
        super(color, filaActual, columnaActual);
    }

    @Override
    public void movimiento(int filaDestino, int columnaDestino) {
            int filaMovimiento = filaDestino - getFilaActual();
            int columnaMovimiento = columnaDestino - getColumnaActual();

            if ((getColor() == Color.BLANCO && filaMovimiento == 1 && columnaMovimiento == 0) ||
                    (getColor() == Color.NEGRO && filaMovimiento == -1 && columnaMovimiento == 0)) {
                System.out.println("Movimiento correcto del peón desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
            } else if ((getColor() == Color.BLANCO && filaMovimiento == 2 && columnaMovimiento == 0 && getFilaActual() == 2) ||
                    (getColor() == Color.NEGRO && filaMovimiento == -2 && columnaMovimiento == 0 && getFilaActual() == 7)) {
                System.out.println("Movimiento correcto del peón desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
            } else if (Math.abs(filaMovimiento) == 1 && Math.abs(columnaMovimiento) == 1) {
                System.out.println("Movimiento correcto del peón desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
            } else {
                System.out.println("Movimiento incorrecto del peón desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
            }
        }
}

class Torre extends Pieza {
    public Torre(Color color, int filaActual, int columnaActual) {
        super(color, filaActual, columnaActual);
    }

    @Override
    public void movimiento(int filaDestino, int columnaDestino) {
        int filaMovimiento = filaDestino - getFilaActual();
        int columnaMovimiento = columnaDestino - getColumnaActual();

        if (filaMovimiento == 0 && columnaMovimiento != 0) {
            System.out.println("Movimiento correcto de la torre desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
        } else if (columnaMovimiento == 0 && filaMovimiento != 0) {
            System.out.println("Movimiento correcto de la torre desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
        } else {
            System.out.println("Movimiento incorrecto de la torre desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
        }
    }
}

class Caballo extends Pieza {
    public Caballo(Color color, int filaActual, int columnaActual) {
        super(color, filaActual, columnaActual);
    }

    @Override
    public void movimiento(int filaDestino, int columnaDestino) {
        int filaMovimiento = filaDestino - getFilaActual();
        int columnaMovimiento = columnaDestino - getColumnaActual();

        if ((Math.abs(filaMovimiento) == 2 && Math.abs(columnaMovimiento) == 1) ||
                (Math.abs(filaMovimiento) == 1 && Math.abs(columnaMovimiento) == 2)) {
            System.out.println("Movimiento correcto del caballo desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
        } else {
            System.out.println("Movimiento incorrecto del caballo desde " + getFilaActual() + "," + getColumnaActual() + " a " + filaDestino + "," + columnaDestino);
        }
    }
}

