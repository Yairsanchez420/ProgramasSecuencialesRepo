import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class CalificacionMediayBaja {
    public static void main(String[] args) {

        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos: "));

        double suma = 0;
        double minCalificacion = Double.MAX_VALUE;


        for (int i = 0; i < alumnos; i++) {

            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion del alumno " + (i + 1) + ":"));
            suma += calificacion;

            if (calificacion < minCalificacion) {
                minCalificacion = calificacion;
            }
        }

        if (alumnos > 0){
            JOptionPane.showMessageDialog(null,"Promedio del grupo: " + (suma / alumnos) +
                                                                       "\nCalificacion mas baja: " + minCalificacion);
        }else {
            JOptionPane.showMessageDialog(null, "No se ingresaron alumnos.");
        }

    }
}
