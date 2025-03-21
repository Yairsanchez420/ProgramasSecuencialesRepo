package mx.edu.uttt.arreglos;

import javax.swing.*;

public class Tienda {
    public static void main(String[] args) {
        int tam = solicitarTamanio();
        String [] prod = new String[tam];
        double [] unidades = new double[tam];
        double [] precios = new double[tam];
        double [] importes = new double[tam];

    }

    public static int solicitarTamanio() {

        int n = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamanio del arreglo"));

            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamanio no puede ser negativo o cero");
            }
        } while (n <= 0);
        return n;
    }
    public static void SolicitarProductos (String [] p){
        for (int i=0; i< p.length; i++){
            p[i] = JOptionPane.showInputDialog("Introduce el nombre del producto");
        }

    }

    public static void imprimir(String [] nombre, double [] unid, double [] precios, double [] importe){





    }

}
