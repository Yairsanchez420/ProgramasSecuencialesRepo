package mx.edu.uttt.subprogrmas;

import javax.swing.*;

public class SerieFactorial {
    public static void main(String[] args) {


        iniciar();
    }

    public static int solicitarN(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de operaciones"));

        if (n<0){
            n*=-1;
        }
        return n;
    }

    public static double solicitarX(){
        return Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
    }

    public static long calFactorial(int n ){

        long f = 1;

        if (n!=0){
            int i = 1;
            while (i<=n) {
                f *= i;
                i++;
            }
        }
        return f;
    }

    public static double calcular(){
        double r = 0.0;
        double x = solicitarX();
        int n = solicitarN();
        int potencia = 2;

        for (int i = 1; i <=n; i++) {
            r += Math.pow(x, potencia) / calFactorial(i);
            potencia += 2;
        }

        return r;
    }

    public static void imprimir (){
        String salida = "El resultado de la serie es: " + String.format("%.3f", calcular());
        JOptionPane.showMessageDialog(null,salida);
    }

    public static void iniciar(){
        imprimir();
    }
}

