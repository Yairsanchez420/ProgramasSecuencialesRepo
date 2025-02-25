import javax.swing.*;

public class AntecesoresSuma {
    public static void main(String[] args) {
        // Pedimos el número al usuario
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo:"));

        // Validamos que N sea positivo
        if (N < 1) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número mayor o igual a 1.");
        } else {
            int suma = 0; // Variable para almacenar la suma
            String secuencia = "Suma de los números anteriores:\n";

            // Calculamos la suma con un ciclo for
            for (int i = 1; i <= N; i++) {
                suma += i; // Acumulamos la suma
                secuencia += i + (i == N ? " = " : " + "); // Guardamos la secuencia
            }

            // Mostramos la secuencia y el resultado
            JOptionPane.showMessageDialog(null, secuencia + suma);
        }
    }
}