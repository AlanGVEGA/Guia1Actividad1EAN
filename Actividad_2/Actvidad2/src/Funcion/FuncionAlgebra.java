package Funcion;
import java.util.Scanner;

public class FuncionAlgebra {
	public static int funcionalgebraica(int x, int y) {
		int resultado = (x*x)+(2*x*y)+(y*y);
		return resultado;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//valor de x
		System.out.print("Introduce el valor de x: ");
		int x = scanner.nextInt();
		//valor de y
		System.out.print("Introduce el valor de y: ");
		int y = scanner.nextInt();
		//llamar al metodo
		int resultado = funcionalgebraica(x, y);
		//imprimir el resultado
		System.out.println("El valor de f(x, y) es: " + resultado);
		scanner.close();
		
	}

}