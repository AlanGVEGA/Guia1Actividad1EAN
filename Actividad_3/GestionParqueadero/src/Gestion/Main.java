package Gestion;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    private static Parqueadero parqueadero = new Parqueadero();

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    ingresarVehiculo(scanner);
                    break;
                case 2:
                    registrarSalida(scanner);
                    break;
                case 3:
                    consultarEstado();
                    break;
                case 4:
                    generarReporte();
                    break;
                case 5:
                    System.out.println("Adios humanos, tengan buen dia :v");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n-----------------------------");
        System.out.println("\n*+*+*+ Parqueadero by AlanV:v *+*+*+\n");
        System.out.println("1. Ingresar un vehiculo");
        System.out.println("2. Registrar salida de un vehiculo");
        System.out.println("3. Consultar estado del parqueadero");
        System.out.println("4. Generar reporte del dia");
        System.out.println("5. Salir");
        System.out.print(":v Seleccione una opcion: ");
    }

    private static void ingresarVehiculo(Scanner scanner) {
        System.out.println("\n-----------------------------");
        System.out.print("Ingrese la placa del vehiculo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el tipo de vehiculo (Automovil, Motocicleta, Camion): ");
        String tipo = scanner.nextLine();
        Vehiculo vehiculo = null;
        LocalDateTime horaEntrada = LocalDateTime.now();

        switch (tipo.toLowerCase()) {
            case "automovil":
                System.out.println("\n-----------------------------");
            	System.out.println("Tarifa_Automovil = 2000 por hora");
                System.out.print("Ingrese el tipo de combustible (Gasolina, Diesel, Electrico): ");
                String tipoCombustible = scanner.nextLine();
                vehiculo = new Automovil(placa, marca, modelo, horaEntrada, tipoCombustible);
                break;
            case "motocicleta":
                System.out.println("\n-----------------------------");
            	System.out.println("Tarifa_Motocicleta = 2000 por hora");
                System.out.print("Ingrese el cilindraje: ");
                int cilindraje = scanner.nextInt();
                vehiculo = new Motocicleta(placa, marca, modelo, horaEntrada, cilindraje);
                break;
            case "camion":
                System.out.println("\n-----------------------------");
            	System.out.println("Tarifa_Camion = 5000 por hora");
                System.out.print("Ingrese la capacidad de carga en toneladas: ");
                double capacidadCarga = scanner.nextDouble();
                vehiculo = new Camion(placa, marca, modelo, horaEntrada, capacidadCarga);
                break;
            default:
                System.out.println("Tipo de vehiculo no valido.");
                return;
        }

        parqueadero.registrarEntrada(vehiculo);
        System.out.println("Vehiculo ingresado exitosamente." + vehiculo.getHoraEntrada());
        System.out.println("\n-----------------------------\n");
    }

    private static void registrarSalida(Scanner scanner) {
        System.out.print("Ingrese la placa del vehiculo que va a salir: ");
        String placa = scanner.nextLine();
        double costo = parqueadero.registrarSalida(placa);
        if (costo > 0) {
            System.out.println("El costo total por el parqueadero es: $" + costo );
        }
    }

    private static void consultarEstado() {
        System.out.println("\n-----------------------------");
        System.out.println("\n--- Estado del Parqueadero ---");
        for (Vehiculo vehiculo : parqueadero.getVehiculosPresentes()) {
            System.out.println("Placa: " + vehiculo.getPlaca() + " | Tipo: " + vehiculo.getTipo() + 
                               " | Marca: " + vehiculo.getMarca() + " | Modelo: " + vehiculo.getModelo());
        }
        System.out.println("\n-----------------------------");

    }

    private static void generarReporte() {
        System.out.println("\n-----------------------------");
        System.out.println("\n--- Reporte del Dia ---");
        for (Vehiculo vehiculo : parqueadero.getReporteDelDia()) {
            System.out.println("Placa: " + vehiculo.getPlaca() + " | Tipo: " + vehiculo.getTipo() + 
                               " | Marca: " + vehiculo.getMarca() + " | Modelo: " + vehiculo.getModelo() +
                               " | Hora de Entrada: " + vehiculo.getHoraEntrada() +
                               " | Hora de Salida: " + vehiculo.getHoraSalida());
        }
        System.out.println("\n-----------------------------");
    }
}
