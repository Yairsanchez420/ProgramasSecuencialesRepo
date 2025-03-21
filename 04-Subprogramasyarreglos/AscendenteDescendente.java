package mx.edu.uttt.arreglos;

import javax.swing.*;

public class AscendenteDescendente {
    public static void main(String[] args) {

        int tam = solicitarTamanio();
        int v1[] = new int[tam];
        llenarArreglo(v1);
        imprimir(v1);

    }

    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("| " + v[i] + " |");

        }
        System.out.println();
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

    public static void llenarArreglo (int [] v){
        int i = 0;


        while (i<v.length){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1)));
            i++;

        }
    }
}
