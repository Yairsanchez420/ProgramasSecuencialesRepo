import javax.swing.*;

public class CalificacionesContador {

    public static void main(String[] args) {
        //Declaracion de variables
        int numAprobados = 0;
        int numReprobados = 0;
        int numeroDeCalif = 0;
        double calif = 0.0;

        numeroDeCalif = Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones se van a evaluar"));

        for (int i = 1; i <= numeroDeCalif; i++) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));

            if (calif >= 7.0) {
                //contador de numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }

        }//cierra ciclo for

        JOptionPane.showMessageDialog(null, "El numero de aprobados es: " + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);

        int i = 1;
        numAprobados = 0;
        numReprobados = 0;

        while (i <= numeroDeCalif) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            if (calif >= 7.0) {
                numAprobados++;
            } else {
                numReprobados++;
            }
            i++;
        }

        JOptionPane.showMessageDialog(null, "El numero de aprobados es: " + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
        i=0;
        numReprobados=0;
        numAprobados=0;

        do {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            if (calif >= 7.0) {
                numAprobados++;
            }else{
                numReprobados++;
            }

            i++;

        }while (i<=numeroDeCalif);

        JOptionPane.showMessageDialog(null, "El numero de aprobados es: " + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}
