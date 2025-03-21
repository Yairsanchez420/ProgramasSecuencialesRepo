package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesArreglos {
    public static void main(String[] args) {
        int tam = validarTamanio();
        int arr1[] = new int[tam];
        int arr2[] = new int[tam];

        llenarArreglo(arr1);
        imprimir(arr1);
//        System.out.println("El promedio es: " + calcularPromedio(arr1));

        int moda = calcularModa(arr1);
        JOptionPane.showMessageDialog(null,moda);

        llenarArreglo(arr2);


        imprimirVector(arr1);
        imprimirVector(arr2);
        System.out.println("La suma de los vectores es: " + sumarVectores(arr1,arr2));



    }

    public static int validarTamanio() {

        int tamanio = 0;

        do {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamanio del arreglo"));
            if (tamanio <= 0) {
                JOptionPane.showMessageDialog(null, "Tamano no valido");

            }
        } while (tamanio <= 0);

        return tamanio;
    }

    public static void llenarArreglo(int[] vector) {
        int valor = 0;
        for (int i = 0; i < vector.length; i++) {
            valor = Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce la posicion[" + "]"));

            vector[i] = valor;
        }

    }

    public static void imprimir(int[] vector) {
        for (int valor : vector) {
            int i = 0;
            System.out.println("El valor de la posicion [" + valor + "] =");
            i++;
        }
    }

    //Realizar una funcion que obtenga el promedio de los valores
    //del vector

    public static double calcularPromedio(int[] vector) {
        double promedio = 0.0;
        for (int x : vector) {
            promedio += x;
        }
        return promedio / vector.length;

    }

    //Realizar una funcion que le solicite al usuario un numero y devuelva el numero
    //de veces que se repite en el vector

    public static int calcularModa(int[] vector) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        int contador = 0;

        for (int num : vector) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;

    }

        // Realizar una funcion que sume 2 vectores

        public static int sumarVectores ( int[] vector1, int[] vector2){

            int resultado = 0;

            for (int i = 0; i < vector1.length; i++) {
                resultado  += vector1[i] + vector2[i]; // Suma elemento a elemento
            }

            return resultado;
        }

        public static void imprimirVector ( int [] arr){

        String salida = "| ";
        for (int valor : arr){
            salida+= valor + " |";
        }


            System.out.println(salida);
        }


    }

