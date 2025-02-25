import javax.swing.*;

public class NumeroMedio {
    public static void main(String[] args) {
        // Pedir los tres números al usuario
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        // Determinar el número medio
        int medio = 0;

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            medio = num2;
        } else {
            medio = num3;
        }

        // Mostrar el número medio
        JOptionPane.showMessageDialog(null, "El número medio es: " + medio);
    }
}

