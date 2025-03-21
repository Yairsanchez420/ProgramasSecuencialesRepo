package mx.edu.uttt.subprogrmas;

import javax.swing.*;

public class Operaciones {
    public static void main(String[] args) {
        iniciar();

    }

    public static double sumar(double numero1, double numero2) {
        double suma = numero1 + numero2;
        return suma;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {

        double division = 0.0;

        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            division = -999;
        }

        return division;
    }

    public static boolean esMayor (double numero1, double numero2){

        //utilizando un if-else

//        if (numero1>numero2){
//            return true;
//        }else{
//            return false;
//        }

        //Utilizando un ternario

//        return (numero1>numero2)?true:false;

        //Retornar directamente sin estructura de control

        return numero1>numero2;

    }

    public  static long calcularFac(int n){

        long fact = 1;
        for (int i = 1; i<=n; i++) {
            fact*=i;
        }

        return fact;
    }

    public static String menu(){
        return "menu\n" +
                "1)Suma\n" +
                "2)Resta\n" +
                "3)Multiplicacion\n" +
                "4)Division\n" +
                "5)Factorial\n" +
                "6)Es mayor\n" +
                "7)Salir\n" +
                "Elegir opcion";
    }

    public static void calcular (String opcion){
        double numero1 = 0.0;
        double numero2 = 0.0;

        switch (opcion){
            case "1":
                JOptionPane.showMessageDialog(null, sumar(solicitarNumero1(), solicitarNumero2()));

                break;
            case "2":
                JOptionPane.showMessageDialog(null, restar(solicitarNumero1(), solicitarNumero2()));

                break;
            case "3":
                JOptionPane.showMessageDialog(null, multiplicar(solicitarNumero1(), solicitarNumero2()));

                break;
            case "4":
                JOptionPane.showMessageDialog(null, dividir(solicitarNumero1(), solicitarNumero2()));

                break;
            case "5":
                JOptionPane.showMessageDialog(null, calcularFac(solicitarN()));

                break;
            case "6":
                JOptionPane.showMessageDialog(null, esMayor(solicitarNumero1(), solicitarNumero2()));

                break;
            case "7":
                break;
            default:
                JOptionPane.showInputDialog(null,"Opcion no valida");
        }
    }

    public static double solicitarNumero1(){
        return Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1"));
    }

    public static double solicitarNumero2() {
        return Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));
    }

    public static int solicitarN (){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de n"));
    }

    public static void iniciar(){
        // Se muestra el menu y se elige una opcion
        String opcion = "";
        do {
            opcion = JOptionPane.showInputDialog(menu());
            if (opcion.equalsIgnoreCase("7")){
                JOptionPane.showMessageDialog(null,"Adios =(");
                break;
            }

            calcular(opcion);
        }while (true);

    }
}
