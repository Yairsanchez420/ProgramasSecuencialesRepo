import javax.swing.*;

public class CuentaRegresiva {
    public static void main(String[] args) {
        String resultado = ""; // Variable para almacenar los números

        // Ciclo que va de 1000 a 0, restando de 1 en 1
        for (int i = 1000; i >= 0; i--) {
            resultado += i + "\n"; // Agregamos cada número con un salto de línea
        }

        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, resultado);
    }
}
