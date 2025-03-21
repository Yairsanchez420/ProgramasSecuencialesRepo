package mx.edu.uttt.arreglos;

import javax.swing.*;

public class NumMayorYMenor {
    public static void main(String[] args) {

       //Crear y llenar al vector
        int tam = solicitarTamanio();
        int v1[] = new int[tam];
        llenarVector(v1);

        //Funciones para encontrar el min y max

        int min = encontrarMenor(v1);
        int max = encontrarMayor(v1);

        //Imprimir resultados

        JOptionPane.showMessageDialog(null,"El numero mayor es " + max + " y El numero menor es " + min);
    }

    public static int solicitarTamanio() {

        int n = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamanio del vector"));

            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamanio no puede ser negativo o cero");
            }
        } while (n <= 0);
        return n;


    }

    public static void llenarVector(int[] v) {
        int i = 0;


        while (i < v.length) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1)));
            i++;

        }
    }

    public static int encontrarMayor(int[] v) {
        int mayor = v[0];
        for (int i = 1; i < v.length; i++) {
            mayor = Math.max(mayor, v[i]); //
        }
        return mayor;
    }

    public static int encontrarMenor(int[] v) {
        int menor = v[0];
        for (int i = 1; i < v.length; i++) {
            menor = Math.min(menor, v[i]);
        }
        return menor;
    }

}

