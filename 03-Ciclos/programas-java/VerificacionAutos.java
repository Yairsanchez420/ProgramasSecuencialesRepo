import javax.swing.*;

public class VerificacionAutos {
    public static void main(String[] args) {

       //Declaracion de variables
       final int TOTAL_AUTOS = 25;

       double sumaContaminantes = 0;
       double minContaminacion = Double.MAX_VALUE;
       double maxContaminacion = Double.MIN_VALUE;

       for (int i = 1; i <= TOTAL_AUTOS; i++){
           double puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminacion del auto " + i + ":"));
           sumaContaminantes += puntos;

           if (puntos < minContaminacion){
               minContaminacion = puntos;
           }

           if (puntos > maxContaminacion){
               maxContaminacion = puntos;
           }
       }
       double promedio = sumaContaminantes / TOTAL_AUTOS;

       String resultado = "Resultados de la verificacion:\n";
       resultado += "Promedio de puntos contaminantes: " + String.format("%.2f",promedio) + "\n";
       resultado += "Auto que menos contamino: " + minContaminacion + "puntos\n";
       resultado += "Auto que mas contamino: " + maxContaminacion + "puntos";

       JOptionPane.showMessageDialog(null,resultado);
    }
}
