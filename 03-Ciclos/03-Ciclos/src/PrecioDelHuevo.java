import javax.swing.*;

public class PrecioDelHuevo {
    public static void main(String[] args) {
        String respuesta;

        do {
            //Necesitamos pedir el numero de gallinas
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de gallinas en la granja:"));
            double sumaCalidad =0;

            //Necesitamos otro ciclo para ingresar los datos de cada gallina

            for (int i = 1; i <= n; i++){
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina " + i + " (en kilos):"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina " + i + "(en metros):"));
                int huevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de huevos que pone la gallina " + i + ":"));

                //Calcular la calidad de la gallina

                double calidad = (peso * altura) / huevos;

                //Acumular la calidad de la gallina

                sumaCalidad += sumaCalidad / n;
            }

            //Calcular el promedio de calida

            double promedioCalidad = sumaCalidad / n;

            //Calcular el precio por kilo de huevo

            double precioPorKilo = 0;
            if (promedioCalidad >= 15){
                precioPorKilo = 1.2 * promedioCalidad;
            } else if (promedioCalidad > 8 && promedioCalidad < 15){
                precioPorKilo = 1.00 * promedioCalidad;
            }else {
                precioPorKilo = 0.80 * promedioCalidad;
            }

            //Necesitamos mostrar el resultado

            JOptionPane.showMessageDialog(null, "El promedio de calidad es: " + promedioCalidad + "\nEl precio por kilo de huevo es: $" + precioPorKilo);

            // Preguntar si desea hacer otro calculo
            respuesta = JOptionPane.showInputDialog(null,"Deseas realizar otro? (si/no):").toLowerCase().trim();
        } while (respuesta.equalsIgnoreCase("si")); //Asi el ciclo se repite

        JOptionPane.showMessageDialog(null,"Gracias por usar el programa.");
    }
}
