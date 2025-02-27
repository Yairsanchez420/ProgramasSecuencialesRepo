import javax.swing.*;

public class CalificacionesSentinel {
    public static void main(String[] args) {
        //Declaracion de variables
        final int SENTINEL = -1;
        double calif = 0.0;
        int numAprobados = 0;
        int numReprobados = 0;
//Definir lo que el programa va a realizar
        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de calificaciones " +
                "Aprobatoria y Reprobatoreias" +
                "\nPara terminar introduce una calificacion con -1 ");
        int x = 1;
        //Iniciacion del calculo
        while (calif != SENTINEL) {
            calif = Double.parseDouble
                    (JOptionPane.showInputDialog("Introduce la calificaion " + x));
            if (calif != SENTINEL) {
                if (calif >= 7.0) {
                    numAprobados++;
                } else {
                    numReprobados++;
                }
                x++;
            }
        }
//Imprimir resultado
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: " + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}