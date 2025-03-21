package mx.edu.uttt.arreglos;

//Elaborar un programa que lee el nombre de un vendedor y las ventas realizadas
// durante los 30 días del mes que las almecene en un arreglo y que imprima el reporte siguiente
import javax.swing.*;

public class Ventas {
    public static void main(String[] args) {
        int tam = validarTamanio();

        double [] ventas = leerventas(tam);

        double total = calcularVentas(ventas);

        JOptionPane.showMessageDialog(null,"Total de ventas de " + nombre() + " es " + total);

    }

    public static String nombre (){
        String nombre;

        nombre = JOptionPane.showInputDialog("Introduce tu nombre");

        return nombre;

    }


    public static int validarTamanio() {

        int tamanio = 0;

        do {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dias de venta"));
            if (tamanio <= 0) {
                JOptionPane.showMessageDialog(null, "Diss no validos");

            }
        } while (tamanio <= 0);

        return tamanio;

    }

    public static double [] leerventas(int tam){
        double [] ventas = new  double[tam];

        for (int i = 0; i < tam; i++) {
            ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del dia " + (i + 1) + ":"));

        }
        return ventas;

    }

    public static double calcularVentas(double[] ventas){
        double total = 0;
        for (double venta : ventas ) {
            total+= venta;

        }

        return total;
    }

}
