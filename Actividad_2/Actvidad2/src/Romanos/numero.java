package Romanos;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numero {
	public static int tomarDecenas(int num) {
		return (int) Math.round(num/10);
	}
	public static String decenasRomanas(int num) {
		List <String> romanos = new ArrayList<>(Arrays.asList(null,"X", "XX", "XXX", "XL", "L","LI","LII","LIII","XC"));
		String letra= romanos.get(num);
		return letra;
	}
	public static int tomarUnidades(int num) {
		return num % 10;
	}
	public static String unidadesRomanas(int num) {
		List <String> romanos = new ArrayList<>(Arrays.asList("","I", "II", "III", "IV", "V","VI","VII","VIII","IX"));
		String letra= romanos.get(num);
		return letra;
	}
	
	public static void main(String[] args) {
		int num =Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero que tenga solo dos digitos: "));
		if(num == 0 || num >=100) {
			String errorM = "Error de ejecucion, porfavor ingresa un numero de dos digitos :v";
			JOptionPane.showMessageDialog(null, errorM);
		}else {
			int decena= tomarDecenas(num);
			int unidad = tomarUnidades(num);
			String numeroRomano = decenasRomanas(decena)+unidadesRomanas(unidad);
			JOptionPane.showMessageDialog(null, "El numero " + num + " tranformado en numero romano es igual a: " + numeroRomano);
		}

		

	}

}
