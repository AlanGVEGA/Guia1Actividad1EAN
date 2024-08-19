package Manana;
import javax.swing.JOptionPane;

public class elManana {
	public static String losMananas(String dias) {
		String nombreDia="";
		if (dias.toLowerCase().equals("lunes")) {
			nombreDia = "Martes";
			return nombreDia;
		}else if (dias.toLowerCase().equals("martes")) {
			nombreDia = "Miercoles";
			return nombreDia;
		}else if (dias.toLowerCase().equals("miercoles")) {
			nombreDia = "Jueves";
			return nombreDia;
		}else if (dias.toLowerCase().equals("jueves")) {
			nombreDia = "Viernes";
			return nombreDia;
		}else if (dias.toLowerCase().equals("viernes")) {
			nombreDia = "Sabado";
			return nombreDia;
		}else if (dias.toLowerCase().equals("sabado")) {
			nombreDia = "Domingo";
			return nombreDia;
		}else if (dias.toLowerCase().equals("domingo")) {
			nombreDia = "Lunes";
			return nombreDia;
		}
		return nombreDia;
	}

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Ingresa un dia de la semana: ");
		String elFuturo= losMananas(dia);
		JOptionPane.showMessageDialog(null, elFuturo);

	}

}
