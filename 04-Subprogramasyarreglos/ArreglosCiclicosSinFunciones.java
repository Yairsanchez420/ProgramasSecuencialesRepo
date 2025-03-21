package mx.edu.uttt.arreglos;

import javax.swing.*;

public class ArreglosCiclicosSinFunciones {
    public static void main(String[] args) {
        int [] arr1;
        int tam = 0;

        do {
            tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamano del arreglo"));
            if (tam<=0)
                JOptionPane.showMessageDialog(null,"Tamano valido");
        }while (tam<=0);

        arr1 = new int[tam];

        //Imprimir arreglo forma 1

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

        //Llenar arreglo
        int i = 0;
        while (i< arr1.length){
            arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor [ " + i + "]"));
            i++;
        }
        System.out.println();

        //Imprimir arreglo forma 2

        for (int valor:arr1){
            System.out.println(valor);
        }



    }
}
