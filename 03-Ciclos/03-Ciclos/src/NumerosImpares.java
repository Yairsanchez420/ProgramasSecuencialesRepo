import javax.swing.*;

public class NumerosImpares {
    public static void main(String[] args) {
        String resultado = "Números impares entre 0 y 100:\n";

        // Usamos un ciclo for para recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i += 2) { // Incrementamos de 2 en 2 (solo impares)
            resultado += i + " ";
        }

        // Mostramos el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}

