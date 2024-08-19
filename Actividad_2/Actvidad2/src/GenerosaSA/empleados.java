package GenerosaSA;
import javax.swing.JOptionPane;

public class empleados {
	public static double aumentos(double salario) {
		double incremento = 0;
		if (salario<800000) {incremento = salario*0.1;}
		else if (salario >=800000 && salario<1200000) {incremento = salario*0.08;}
		else {incremento = salario*0.05;}
		
		return incremento;
	}

	public static void main(String[] args) {
		double salarioActual = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario actual: "));
		double nuevoSalario = salarioActual + aumentos(salarioActual);
		JOptionPane.showMessageDialog(null, "Tu salario antes del aumento: " + salarioActual + "  Tu nuevo salario: " + nuevoSalario);

	}

}
