package Cartesiano;
import java.util.Scanner;

public class coordenadas {
	public static double distanciaEntrePuntos(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((y2-y1)*(y2-y1)) + ((x2-x1)*(x2-x1)));
	}
	public static double pendiente(double x1, double y1, double x2, double y2) {
		return ((y2-y1)/(x2-x1));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ingresa x1: "); double x1 = input.nextDouble();
		System.out.println("ingresa y1: "); double y1 = input.nextDouble();
		System.out.println("ingresa x2: "); double x2 = input.nextDouble();
		System.out.println("ingresa y2: "); double y2 = input.nextDouble();
		double distancia = distanciaEntrePuntos(x1,y1,x2,y2);
		System.out.println("La distancia entre los dos puntos es :" + distancia);
		double m = pendiente(x1,y1,x2,y2);
		System.out.println("La pendiente de la recta entre los dos puntos es :" + m);

		input.close();
	}

}
