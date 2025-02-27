import javax.swing.*;

public class TablaDeMultiplicar {
    public static void main(String[] args) {

        //Declaramos las variables
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para multiplicar: "));


        String resultado = "Tabla del " + numero + ":\n";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        //Imorimos el resultado

        JOptionPane.showMessageDialog(null,resultado);
    }
}
