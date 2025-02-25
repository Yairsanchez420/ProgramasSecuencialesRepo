import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        // Pedimos un número entero positivo
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo:"));

        // Validamos que N sea mayor o igual a 0
        if (N < 0) {
            JOptionPane.showMessageDialog(null, "Error: El número debe ser positivo.");
        } else {
            long factorial = 1; // Usamos long para evitar desbordamiento con números grandes

            // Calculamos el factorial con un ciclo for
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }

            // Mostramos el resultado
            JOptionPane.showMessageDialog(null, "El factorial de " + N + " es: " + factorial);
        }
    }
}

