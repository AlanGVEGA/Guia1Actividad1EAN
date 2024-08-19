package Operadores;

import javax.swing.JOptionPane;

public class operadoresLogicos {
	public static double operar(int num1, int num2, String operador) {
		double respuesta=0;
		if (operador.equals("+")) {
			respuesta = num1+num2;
		}else if (operador.equals("-")) {
			respuesta = num1 - num2;
		}else if (operador.equals("*")) {
			respuesta = num1 * num2;
		}else if (operador.equals("/")) {
			respuesta = num1 / num2;
		}else if (operador.equals("%")) {
			respuesta = num1 % num2;
		}else if (operador.equals("**")) {
			respuesta = Math.pow(num1, num2);
		}return respuesta;
	}

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa otro numero: "));
		String operador;
		operador = JOptionPane.showInputDialog("ingresa el tipo de operacion que quieres hacer (+,-,*,/,%,**): ");
		double respuesta =operar(num1,num2,operador);
		JOptionPane.showMessageDialog(null, "El resultado de " + num1 +" "+ operador + " "+num2 + " es: " + respuesta);


	}

}
