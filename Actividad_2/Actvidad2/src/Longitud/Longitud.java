package Longitud;
import java.util.Scanner;

public class Longitud {
	public static float calcularLongitud(float x, float a) {
		float resultado = (float) (x / Math.sin(Math.toRadians(a)));
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresar el valor de x: ");//valor de x
		float x = scanner.nextFloat();
		System.out.print("Ingresar el valor del angulo: ");//valor del angulo
		float a = scanner.nextFloat();
		float resultado = calcularLongitud(x, a);//llamar al metodo
		System.out.println("La longitud de la escalera es: " + resultado); //imprimir el resultado
		scanner.close();

	}

}
