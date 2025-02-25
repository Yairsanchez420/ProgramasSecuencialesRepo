import javax.swing.*;

public class CalificacionesAcomulativas1 {

    public static void main(String[] args) {
        double calif = 0.0;
        double acumcalif = 0.0;
        int numCalif = 0;

        //Solicitar el numerp de calificaciones
        numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones"));

        for (int i = 0; i < numCalif; i++) {
            acumcalif += Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + (i + 1)));

        }
    }
}
