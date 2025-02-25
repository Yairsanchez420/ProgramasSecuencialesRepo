import javax.swing.*;

public class PromedioEdades {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos en el grupo:"));

        int hombres = 0, mujeres = 0;
        double sumaHombres = 0, sumaMujeres = 0, sumaTotal = 0;

        for (int i = 1; i <= n; i++) {
            String sexo = JOptionPane.showInputDialog("Alumno " + i + " - Ingrese el sexo (Hombre/Mujer):").toLowerCase();
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + " - Ingrese su edad:"));

            sumaTotal += edad; // Sumar edad total para el promedio general

            if (sexo.equals("hombre")) {
                hombres++;
                sumaHombres += edad; // Sumar edad de hombres
            } else if (sexo.equals("mujer")) {
                mujeres++;
                sumaMujeres += edad; // Sumar edad de mujeres
            } else {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ser 'Hombre' o 'Mujer'.");
                i--; // Decrementa el contador para pedir la información nuevamente
            }
        }

        double promedioTotal = sumaTotal / n;
        double promedioHombres = (hombres > 0) ? sumaHombres / hombres : 0;
        double promedioMujeres = (mujeres > 0) ? sumaMujeres / mujeres : 0;

        String resultado = "Resultados:\n";
        resultado += "Promedio de edades en todo el grupo: " + String.format("%.2f", promedioTotal) + "\n";
        resultado += "Promedio de edades de hombres: " + String.format("%.2f", promedioHombres) + "\n";
        resultado += "Promedio de edades de mujeres: " + String.format("%.2f", promedioMujeres);

        JOptionPane.showMessageDialog(null, resultado);
    }
}

