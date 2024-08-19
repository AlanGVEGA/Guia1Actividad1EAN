package AreaCirculo;
import java.util.Scanner;

public class Circulo {
	public static double areaCirculo(double RadioPequeno) {
		return Math.PI *(RadioPequeno*RadioPequeno);
	}
	public static double coronaCircular(double RadioGrande, double RadioPequeno) {
		return Math.PI *((RadioGrande*RadioGrande)-(RadioPequeno*RadioPequeno));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el radio pequeno 'r': ");
		double r = input.nextDouble();
		System.out.println("Introduce el radio grande 'R': ");
		double R = input.nextDouble();
		System.out.println("El area de la corona circular es: " + coronaCircular(R,r));
		System.out.println("El area del circulo pequeno es: " + areaCirculo(r));
		input.close();
	}

}
