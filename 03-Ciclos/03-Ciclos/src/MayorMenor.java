import javax.swing.*;

public class MayorMenor {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));

        // Variables para el mayor y el menor
        int mayor = Integer.MIN_VALUE; // Un número muy pequeño
        int menor = Integer.MAX_VALUE; // Un número muy grande

        // Pedimos los números y encontramos el mayor y menor
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (num > mayor) { // Si el número es mayor, lo actualizamos
                mayor = num;
            }

            if (num < menor) { // Si el número es menor, lo actualizamos
                menor = num;
            }
        }

        // Mostramos los resultados
        JOptionPane.showMessageDialog(null, "Número mayor: " + mayor + "\nNúmero menor: " + menor);

    }
}
