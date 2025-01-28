import javax.swing.*;

/**
 *Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
 * siguientes características
 * a. Se debe almacenar el nombre del empleado
 * b. Las horas trabajadas que deben ser horas sin parte fraccionaria
 * c. Cuota por hora
 * d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
 */

public class SueldoEmpleado {
    public static void main(String[] args) {

        // Declaracion de variables

        String nombre;
        int hT=0;
        double cuotaHora= 0.0;
        double sueldo = 0.0;

        
        //Entrada de valores

        nombre = JOptionPane.showInputDialog("Introduce el nombre del trabajador: ");
        cuotaHora = Double.parseDouble(JOptionPane.showInputDialog("Introduce las horas trabjadas:");
        sueldo = Integer.parseInt(JOptionPane.showInputDialog())r

    }
}
