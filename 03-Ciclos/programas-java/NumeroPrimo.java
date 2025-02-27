import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {

        // Pedimos el número al usuario
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo:"));

        // Verificamos si es primo
        boolean esPrimo = true;

        if (N <= 1) {
            esPrimo = false; // Números 1 y menores no son primos
        } else if (N == 2) {
            esPrimo = true; // 2 es primo
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) { // Si N es divisible por i, no es primo
                    esPrimo = false;
                    break; // Terminamos el ciclo si encontramos un divisor
                }
            }
        }

        // Mostramos el resultado
        String mensaje = esPrimo ? "El número " + N + " es primo." : "El número " + N + " no es primo.";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
