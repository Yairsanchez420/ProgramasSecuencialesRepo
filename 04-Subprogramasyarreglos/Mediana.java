package mx.edu.uttt.arreglos;

import javax.swing.*;

public class Mediana {
    public static void main(String[] args) {

        // crar y oedir el tamaño del vector

        int tam = TamanioDlVector();
        int v1[] = new int[tam];
        int v2[] = new int[tam];

        // Llenar los vectores

        llenarVector(v1, "primer");
        llenarVector(v2, "segundo");

        // Imprimir los vectores

        System.out.println("\nVector 1:");
        mostrarVector(v1);

        System.out.println("\nVector 2:");
        mostrarVector(v2);

        // Ordenar los vectores

        ordenarVector(v1);
        ordenarVector(v2);

        // Calcular y mostrar las medianas

        System.out.println("\nMediana del Vector 1: " + calcularMediana(v1));
        System.out.println("Mediana del Vector 2: " + calcularMediana(v2));
    }

    // Función para pedir el tamaño del vector

    public static int TamanioDlVector() {
        int n = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamanio del vector"));
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamaño no puede ser negativo o 0");
            }
        } while (n <= 0);
        return n;
    }

    // Función para llenar el vector

    public static void llenarVector(int[] v, String nombre) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Pon el valor para la posición " + (i + 1) + " del " + nombre + " vector:"));
        }
    }

    // Función para mostrar el vector

    public static void mostrarVector(int[] v) {
        String resultado = "[ ";
        for (int i = 0; i < v.length; i++) {
            resultado += v[i] + " ";
        }
        resultado += "]";
        System.out.println(resultado);
    }

    // Función para ordenar el vector

    public static void ordenarVector(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    // Intercambiar los valores
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
    }

    // Función para calcular la mediana

    public static double calcularMediana(int[] v) {
        int n = v.length;

        if (n % 2 == 1) {
            // Si es impar, tomamos el valor de la mitad
            return v[n / 2];
        } else {
            // Si es par, promediamos los dos valores del medio
            return (v[n / 2 - 1] + v[n / 2]) / 2.0;
        }
    }
}