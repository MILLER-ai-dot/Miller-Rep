public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, int año, double precioBase, int cilindraje) {
        super(marca, modelo, año, precioBase);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString()+"Motocicleta" +
                "cilindraje= " + cilindraje ;
    }
}
