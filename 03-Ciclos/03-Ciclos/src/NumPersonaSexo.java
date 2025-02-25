import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.util.Locale;

public class NumPersonaSexo {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de personas en el grupo: "));

        int hombres = 0, mujeres = 0;

        for (int i = 1; i <= n; i++){
            String sexo = JOptionPane.showInputDialog("Alumno " + i + "- Ingrese el sexo (Hombre/Mujer): ").toLowerCase();

            if (sexo.equalsIgnoreCase("hombre")) {
                hombres++;
            }else if (sexo.equalsIgnoreCase("mujer")) {
                mujeres++;

            } else {
                JOptionPane.showMessageDialog(null, "Entrada no valida. Debe ser 'Hombre' o 'Mujer'.");
            }
        }

        String resultado = "Resultado:\n" + "Hombres: " + hombres + "\n" + "mujeres: " + mujeres;
        JOptionPane.showMessageDialog(null,resultado);
    }
}
