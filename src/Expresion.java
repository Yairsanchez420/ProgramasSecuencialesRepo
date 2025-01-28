/*

 */


import javax.swing.*;

public class Expresion {

    public static void main(String[] args) {
        double x=0.0;
        double y=0.0;
        double n=0.0;
        String salida="";

        //Solicitar tus datos
        x= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
        y= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y: "));

        //Calcular la expresion

        n= (x + y)/ (y - 1);

        //Salida del programa

        salida= "El resulatado de la expresion es: "
    }
}
