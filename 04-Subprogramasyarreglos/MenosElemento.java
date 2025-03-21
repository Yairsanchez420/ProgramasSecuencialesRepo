package mx.edu.uttt.arreglos;

import javax.swing.*;

public class MenosElemento {
    public static void main(String[] args) {

        // Crear y pedir tamaño del vector

        int tamanio = TamaniodelVector();
        int[] vector = new int[tamanio];

        // Llenar el vector

        llenarVector(vector);

        // Mostrar el vector

        System.out.println("Este es el vector:");
        mostrarVector(vector);

        // Pedir el número a eliminar

        int eliminar = pedirNumeroEliminar();

        // Eliminar el número

        int[] nuevoVector = eliminarNumero(vector, eliminar);

        // Mostrar el nuevo vector

        System.out.println("El vector después de eliminar el " + eliminar + ":");
        mostrarVector(nuevoVector);
    }

    // Función para pedir el tamaño

    public static int TamaniodelVector() {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos elementos tendrá tu vector?"));
        return tamanio;
    }

    // Función para llenar el vector

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Pon el valor " + (i + 1) + " en el vector:"));
        }
    }

    // Función para mostrar el vector

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    // Función para pedir el número a eliminar

    public static int pedirNumeroEliminar() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Qué número quieres eliminar del vector?"));
        return numero;
    }

    // Función para eliminar el número
    public static int[] eliminarNumero(int[] vector, int eliminar) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == eliminar) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("El número no está en el vector.");
            return vector;
        }

        int[] nuevoVector = new int[vector.length - contador];
        int indice = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != eliminar) {
                nuevoVector[indice] = vector[i];
                indice++;
            }
        }

        return nuevoVector;
    }
}

