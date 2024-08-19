package ElPaseo;
import java.util.Scanner;

public class BusElPaseo {
	public static int calcularBuses(int estudiantesGordos, int estudiantesFlacos, int sillasPorBus) {
	    int totalSillasParaUsar = (2 * estudiantesGordos) + estudiantesFlacos;
	    int busesNecesarios = (int) Math.ceil((double) totalSillasParaUsar / sillasPorBus);
	    return busesNecesarios;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // Leer el número de estudiantes gordos
        System.out.print("Introduce el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();
        // Leer el número de estudiantes flacos
        System.out.print("Introduce el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();
        // Leer el número de sillas por bus
        System.out.print("Introduce el número de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();
        // Calcular el número de buses necesarios
        int busesNecesarios = calcularBuses(estudiantesGordos, estudiantesFlacos, sillasPorBus);

        System.out.println("Se necesitan " + busesNecesarios + " buses para el paseo.");
        scanner.close();

	}

}
