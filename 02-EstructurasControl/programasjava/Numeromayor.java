
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

//for (inicialización; condición; actualización) {
//     Código que se ejecuta en cada iteración

//for (int i = 1; i <= 5; i++) {
//    System.out.println(i);
//}

//while (condición) {
//    // Código que se ejecuta mientras la condición sea verdadera
//}

//int i = 1;
//while (i <= 5) {
//    System.out.println(i);
//    i++; // Importante: actualizar la variable para evitar un bucle infinito
//}

//do {
//    // Código que se ejecuta al menos una vez
//} while (condición);

//int num;
//do {
//    num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número (0 para salir):"));
//    System.out.println("Ingresaste: " + num);
//} while (num != 0);

//¿Cuándo usar cada uno?
//✔ for → Cuando sabes cuántas veces se repetirá.
//✔ while → Cuando no sabes cuántas veces, pero hay una condición clara.
//✔ do-while → Cuando necesitas ejecutar el código al menos una vez antes de evaluar la condición.

