
/*
Evaluar si un numero es mayor a 10, utilizando el operador
ternario (?)

(EXPRESION)
 */


import javax.swing.*;

public class Numeromayor {
    public static void main(String[] args) {

        //Declaracion de variables
        double numero=0.0;
        String salida= "";

        //Entrada
        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero"));

        salida = (numero>10)?"El numero es mayor a 10":"El numero es menor a 10";

        JOptionPane.showMessageDialog(null, salida);

        if (numero>10){
            salida= "El numero es mayor a 10";
        }else{
            salida= "El numero es menor a 10";
        }
    }
}
