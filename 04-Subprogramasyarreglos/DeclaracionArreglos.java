package mx.edu.uttt.arreglos;

public class DeclaracionArreglos {
    public static void main(String[] args) {
        //Declaracion de arreglo (vectores)
        int arr1[];
        arr1 = new int[5];

        System.out.println("El tamano del arreglo es: " + arr1.length);

        System.out.println("El valor es: " + arr1[4]);
        arr1[4] = 9;
        System.out.println("El valor es: " + arr1[arr1.length - 1]);
        System.out.println("El valor es: " + arr1[2 * 2]);
        System.out.println("El valor es: " + arr1[4 / 2]);

        //Declaracion de vector tipo 2

        boolean[] arr2 = new boolean[3];
        System.out.println("Tamano: " + arr2.length);
        arr2[arr2.length-1] = true;
        System.out.println("Valor: " + arr2[arr2.length - 1]);

        //Declaracion tipo 3 del vector

        float arr3 [] = {12.3f, 12.3f, 34.5f, 56.7f, 78.9f};

        System.out.println(arr3.length);
        System.out.println(arr3[3]);

        float arr4 [] = new float[4];

        System.out.println(arr4[3]);

        }

    }

