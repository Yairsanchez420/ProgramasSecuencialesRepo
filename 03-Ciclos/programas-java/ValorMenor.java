import javax.swing.*;

public class ValorMenor {
    public static void main(String[] args) {
        //Declaracion de variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));

        double menorValor = Double.MAX_VALUE; // Inicializamos el menor valor con el valor más grande posible

        for (int i = 1; i <= n; i++) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            // Si el número ingresado es menor que el actual menor valor, actualizamos
            if (numero < menorValor) {
                menorValor = numero;
            }
        }

        // Mostramos el menor valor encontrado
        JOptionPane.showMessageDialog(null, "El menor valor ingresado es: " + menorValor);
    }
}

