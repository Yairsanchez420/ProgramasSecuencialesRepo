package mx.edu.uttt.arreglos;

import javax.swing.*;

public class Elemento {
    public static void main(String[] args) {

        // Crear y pedir el tamaño del vector

        int tamanioVector = TamanioDelVector();
        int[] vector = new int[tamanioVector];

        // Llenar el vector

        llenarVector(vector);

        // Pedir el número que queremos buscar

        int numeroBuscado = NumeroQueBusco();

        // Buscar el número en el vector

        int posicionEncontrada = BuscarNumero(vector, numeroBuscado);

        // Mostrar el resultado de la búsqueda

        ResultadoBusqueda(numeroBuscado, posicionEncontrada);
    }

    // Función para pedir el tamaño del vector

    public static int TamanioDelVector() {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del vector:"));
        return tamanio;
    }

    // Función para llenar el vector

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + ":"));
        }
    }

    // Función para pedir el número que queremos buscar

    public static int NumeroQueBusco() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que deseas buscar:"));
        return numero;
    }

    // Función para buscar el número en el vector

    public static int BuscarNumero(int[] vector, int numeroBuscado) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroBuscado) {
                return i; // Si lo encuentra, retorna la posición
            }
        }
        return -1; // Si no lo encuentra, retorna -1
    }

    // Función para mostrar el resultado de la búsqueda

    public static void ResultadoBusqueda(int numeroBuscado, int posicionEncontrada) {
        if (posicionEncontrada != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + posicionEncontrada);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }
    }
}


