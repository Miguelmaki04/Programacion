package romeroLopezMiguelAngel.Ejercicio1;

public class Ejercicio1 {
    enum Color {
        ROJO, AZUL, VERDE, AMARILLO
    }

    class Vehiculo {
        private Color color;
        private final int añoDeFabricacion;
        private String modelo;

        public Vehiculo(Color color, int anioDeFabricacion, String modelo) {
            this.color = color;
            this.añoDeFabricacion = anioDeFabricacion;
            this.modelo = modelo;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public int getAñoDeFabricacion() {
            return añoDeFabricacion;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void mostrarInformacion() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Año de fabricación: " + añoDeFabricacion);
            System.out.println("Color: " + color);
        }

        public void repintarVehiculo(Color nuevoColor) {
            this.color = nuevoColor;
            System.out.println("El vehículo ha sido repintado de " + color + " a " + nuevoColor);
        }
    }

    class Ferrari extends Vehiculo {
        private int caballos;

        public Ferrari(Color color, int añoDeFabricacion, String modelo, int caballosDeFuerza) {
            super(color, añoDeFabricacion, modelo);
            this.caballos = caballosDeFuerza;
        }

        public int getCaballosDeFuerza() {
            return caballos;
        }

        public void setCaballosDeFuerza(int caballosDeFuerza) {
            this.caballos = caballosDeFuerza;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Caballos: " + caballos);
        }
    }

    class Seat extends Vehiculo {
        private String tipoDeCombustible;

        public Seat(Color color, int añoDeFabricacion, String modelo, String tipoDeCombustible) {
            super(color, añoDeFabricacion, modelo);
            this.tipoDeCombustible = tipoDeCombustible;
        }

        public String getTipoDeCombustible() {
            return tipoDeCombustible;
        }

        public void setTipoDeCombustible(String tipoDeCombustible) {
            this.tipoDeCombustible = tipoDeCombustible;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Tipo de Combustible: " + tipoDeCombustible);
        }
    }
}
