package EdificioNuevo;
import java.util.Scanner;

public class nuevoEdificio {
	public static int calcularSalones(int estudiantes, int capacidadSalon) {
		return (int) Math.ceil((double) estudiantes / capacidadSalon);
	}
	public static int calcularPisos(int numSalones, int salonxPiso) {
		return (int) Math.ceil((double) numSalones/salonxPiso);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ingresa el numero de estudiantes: ");
		int estudiantes =input.nextInt();
		System.out.println("ingresa la capacidad de estudiantes en el salon: ");
		int numEstxSalon =input.nextInt();
		System.out.println("ingresa el numero de salones por piso: ");
		int salonxPiso =input.nextInt();
		
		System.out.println("El numero de salones es: " + calcularSalones(estudiantes,numEstxSalon));
		System.out.println("El numero de pisos por salon es: " + calcularPisos(calcularSalones(estudiantes,numEstxSalon), salonxPiso));

	}

}
