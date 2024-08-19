package Hermanos;
import javax.swing.JOptionPane;

public class mayor {
    public static String hermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        if (edad1 >= edad2 && edad1 >= edad3) {
            return nombre1;
        } else if (edad2 >= edad1 && edad2 >= edad3) {
            return nombre2;
        } else {
            return nombre3;
        }
    }

    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingresa un nombre: ");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
        String nombre2 = JOptionPane.showInputDialog("Ingresa un nombre: ");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
        String nombre3 = JOptionPane.showInputDialog("Ingresa un nombre: ");
        int edad3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));

        String nombreMayor = hermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);
        JOptionPane.showMessageDialog(null, "El hermano mayor es: " + nombreMayor);;
    }
}