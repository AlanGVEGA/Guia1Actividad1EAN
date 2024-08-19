package NumeroMayor;
import java.util.Scanner;

public class Mayor {
	public static int mayorEntreNum(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else if (num1==num2) {
			return 0;
		}else {
			return num2;
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Digita el primer numero: ");
		int num1 = input.nextInt();
		System.out.print("Digita el segundo numero: ");
		int num2 = input.nextInt();
		
		if(mayorEntreNum(num1,num2)>0) {
			System.out.println("El numero mayor es: "+mayorEntreNum(num1,num2));
		}else {System.out.println("Los numeros son iguales");}
		input.close();

	}

}
