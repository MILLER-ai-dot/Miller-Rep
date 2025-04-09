public class Auto extends Vehiculo{
    private int numerodePuertas;

    public Auto(String marca, String modelo, int año, double precioBase) {
    }

    public Auto(String marca, String modelo, int año, double precioBase, int numerodePuertas) {
        super(marca, modelo, año, precioBase);
        this.numerodePuertas = numerodePuertas;
    }

    public int getNumerodePuertas() {
        return numerodePuertas;
    }

    public void setNumerodePuertas(int numerodePuertas) {
        this.numerodePuertas = numerodePuertas;
    }

    @Override
    public String toString() {
        return super.toString() +"Auto" +
                "numerodePuertas=" + numerodePuertas;
    }
}
