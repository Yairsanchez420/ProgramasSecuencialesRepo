package mx.edu.uttt.arreglos;

import javax.swing.*;

public class Moda {
    public static void main(String[] args) {

        // Crear un vrctor de tamaño 15

        int[] vector = new int[15];

        // Llenar el vecor con los valores

        llenarVector(vector);

        // Imprimir el vector

        System.out.print("Vector: ");
        Imprimir(vector);

        // Mostrar la moda del vector

        mostrarModa(vector);
    }

    // Función para llenar el vector

    public static void llenarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(JOptionPane
                    .showInputDialog("Introduce el valor para la posición " + (i + 1)));
        }
    }

    // Función para imprimir el vector

    public static void Imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    // Función para mostrar la moda

    public static void mostrarModa(int[] v) {
        int[] frecuencia = new int[10];

        // Calcular la frecuencia de cada número

        for (int i = 0; i < v.length; i++) {
            frecuencia[v[i] - 1]++;
        }

        // Encontrar la frecuencia máxima

        int maxFrecuencia = 0;
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
            }
        }

        // Mostrar los valores

        System.out.print("Moda: ");
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] == maxFrecuencia) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}

