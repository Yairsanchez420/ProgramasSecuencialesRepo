import javax.swing.*;

public class TablaDeMultiplicar {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para multiplicar: "));


        String resultado = "Tabla del " + numero + ":\n";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        JOptionPane.showMessageDialog(null,resultado);
    }
}
