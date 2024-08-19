package EmpresaInmobiliaria;
import java.util.Scanner;

public class geometria {
	public static double areas(double base, double altura) {return base*altura;}
	
	public static double calcularHipotenusa(double catetoOp, double catetoAd) {
		return Math.sqrt((catetoOp*catetoOp)+(catetoAd*catetoAd));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ingresa el lado A: "); double A = input.nextDouble();
		System.out.println("ingresa el lado B: "); double B = input.nextDouble();
		System.out.println("ingresa el lado C: "); double C = input.nextDouble();
		
		System.out.println("El area del rectangulo es: " + areas(B,C));
		System.out.println("La hipotenusa del triangulo es: " + calcularHipotenusa(A-C,B));
		System.out.println("El area del triangulo es: " + (areas(B,A-C)/2));
		System.out.println("El perimetro del terreno es: " + (A+B+C+(areas(B,A-C)/2)));
		input.close();
		
	}

}
