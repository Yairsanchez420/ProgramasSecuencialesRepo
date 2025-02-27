import javax.swing.*;

public class SumaMultiplica {
    public static void main(String[] args) {
        // Pedimos la cantidad de números a ingresar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));

        // Inicializamos variables
        int sumaPositivos = 0;  // Para la suma de los positivos
        int productoNegativos = 1; // Para la multiplicación de los negativos
        boolean hayNegativos = false; // Para verificar si hubo negativos

        // Ciclo para ingresar los números
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (num >= 0) {
                sumaPositivos += num;  // Sumamos los positivos
            } else {
                productoNegativos *= num;  // Multiplicamos los negativos
                hayNegativos = true; // Indicamos que hay al menos un número negativo
            }
        }

        // Si no hubo negativos, asignamos 0 al producto para evitar que quede en 1
        if (!hayNegativos) {
            productoNegativos = 0;
        }

        // Mostramos los resultados
        JOptionPane.showMessageDialog(null, "Suma de positivos: " + sumaPositivos +
                "\nProducto de negativos: " + productoNegativos);
    }
}

