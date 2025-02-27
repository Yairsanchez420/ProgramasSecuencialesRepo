import javax.swing.*;

public class CalificacionesSentinel2 {
    public static void main(String[] args) {
        //Declaracion de variables
        boolean sentinel = true;
        double calif = 0.0;
        int numAprobados = 0;
        int numReprobados = 0;

        //Definir lo que el programa hace
        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de calificaciones " +
                "Aprobatorias y Reprobatorias" +
                "\nPara terminar introduce una calificacion con -1 ");
        int x = 1;

        //Inicianilizacion de los calculos
        while (sentinel) {
            calif = Double.parseDouble
                    (JOptionPane.showInputDialog("Introduce la calificaion " + x));
            if (calif != -1) {
                if (calif >= 7.0) {
                    numAprobados++;
                } else {
                    numReprobados++;
                }
                x++;
            }else{
                sentinel=false;
            }
        }
//Imorimir esultados
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: " + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}


