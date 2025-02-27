import javax.swing.*;

public class ValorMayor {
    public static void main(String[] args) {

        //Declaracion de variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));

        double mayorValor = Double.MIN_VALUE; // Inicializamos el mayor valor con el valor mas chico

        for (int i = 1; i <= n; i++) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            // Si el número ingresado es mayor que el actual mayor valor, actualizamos
            if (numero > mayorValor) {
                mayorValor = numero;
            }
        }

        // Mostramos el menor valor encontrado
        JOptionPane.showMessageDialog(null, "El menor valor ingresado es: " + mayorValor);
    }
}
