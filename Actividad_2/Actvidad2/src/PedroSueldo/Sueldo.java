package PedroSueldo;
import java.util.Scanner;

public class Sueldo {
	public static double Arriendo(double sueldo) {
		double gastosA =  sueldo * .40;
		return gastosA;
	}
	public static double Comida(double sueldo) {
		double gastosC =  sueldo * .15;
		return gastosC;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pablo, ingresa el sueldo disponible: ");
		double sueldo = input.nextDouble();
		System.out.println("Este sera tu gasto con el arriendo: " + Arriendo(sueldo));
		System.out.println("Este sera tu gasto con la comida: " + Comida(sueldo));
		System.out.println("Este es tu saldo disponible despues de los gastos: " + (sueldo-(Arriendo(sueldo)+Comida(sueldo))));
		input.close();

	}

}
