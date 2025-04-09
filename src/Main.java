import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        int opc;
        Scanner t = new Scanner(System.in);
        List<Vehiculo> vehiculo = new ArrayList<>();
        do {
            System.out.println("""
                    --------------------------------------
                         Consecionario de Vehiculos
                    --------------------------------------
                     ingresa que vehiculo quieres alquilar:
                     1)Autos
                     2)Motocicletas
                     3)Mostrar Vehiculos Alquilados
                    --------------------------------------
                    """);
            opc = t.nextInt();
            switch (opc) {
                case 1 -> {
                    String Marca;
                    String Modelo;
                    int Año;
                    double PrecioBase;
                    int Npuertas;
                    t.nextLine();
                    System.out.println("Auto");
                    System.out.println("Marca: ");
                    Marca = t.nextLine();
                    System.out.println("Modelo: ");
                    Modelo = t.nextLine();
                    System.out.println("Año: ");
                    Año = t.nextInt();
                    System.out.println("Precio: ");
                    PrecioBase = t.nextDouble();
                    System.out.println("N.Puertas: ");
                    Npuertas = t.nextInt();
                    vehiculo.add(new Auto(Marca,Modelo,Año,PrecioBase,Npuertas));

                }
                case 2 -> {
                    String Marca;
                    String Modelo;
                    int Año;
                    double PrecioBase;
                    int Cilindraje;
                    t.nextLine();
                    System.out.println("Motocicleta");
                    System.out.println("Marca: ");
                    Marca = t.nextLine();
                    System.out.println("Modelo: ");
                    Modelo = t.nextLine();
                    System.out.println("Año: ");
                    Año = t.nextInt();
                    System.out.println("Precio: ");
                    PrecioBase = t.nextDouble();
                    System.out.println("Cilindraje: ");
                    Cilindraje = t.nextInt();
                    vehiculo.add(new Motocicleta(Marca,Modelo,Año,PrecioBase,Cilindraje));
                }
                case 3 -> {
                    int opc2;
                    System.out.println("""
                    Que Vehiculos quieres ver
                    1)Autos
                    2)Motocicletas
                            """);
                    opc2 = t.nextInt();
                    switch (opc2){
                        case 1 ->{
                            for (Vehiculo e: vehiculo){
                                if (e instanceof Auto){
                                    System.out.println(e+"Precio final: "+e.calcularPrecioFinal());
                                }
                            }
                        }
                        case 2 ->{
                            for (Vehiculo e: vehiculo){
                                if (e instanceof Motocicleta){
                                    System.out.println(e+" Precio final: "+e.calcularPrecioFinal());
                                }
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Ingrese una opcion valida");
            }
        }while(opc !=4);
    }
}