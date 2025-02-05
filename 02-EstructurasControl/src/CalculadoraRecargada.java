import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu = "";
        String opcion = "", resultado = "";
        double  numero1 = 0.0, numero2 = 0.0;

        menu = "MENU PRINCIPAL\n" +
                "A)Sumar\nB)Restar\n" +
                "C)Multiplicar\n" +
                "D)Dividir\n" +
                "E)Modulo\n" +
                "Elegir una opcion";

        opcion = JOptionPane.showInputDialog(menu);

//        JOptionPane.showMessageDialog(null, opcion);


        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));

        opcion = opcion.toUpperCase();

        if (numero2 > 0.0) {
            switch (opcion) {
                case "A":
                    //Suma
                    resultado = "La Suma es: " + (numero1 + numero2);
                    break;
                case "B":
                    //Resta
                    resultado =
                    "La Resta es : " + (numero1 - numero2);
                    break;
                case "C":
                    //Multiplicacion
                    resultado =
                    "La Multiplicacion es : " + (numero1 * numero2);
                    break;
                case "D":
                    //Division
                    resultado =
                    "La Division es : " + (numero1 / numero2);;
                    break;
                case "E":
                    //Modulo
                    resultado =
                    "El modulo es : " + (numero1 % numero2);

                    break;
                default:
                    resultado ="Caso no valido";

            }
            JOptionPane.showMessageDialog(null, resultado);


        } else {
            JOptionPane.showMessageDialog(null, "El numero 2 no puede ser 0 o negativo");
        }
    }
}

