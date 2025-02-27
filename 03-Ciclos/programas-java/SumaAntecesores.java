import javax.swing.*;

public class SumaAntecesores {
        public static void main(String[] args) {
            // Pedir al usuario que ingrese un número
            String input = JOptionPane.showInputDialog("Ingresa un número:");
            int numero = Integer.parseInt(input); // Convertir la entrada a un entero

            int suma = 0; // Variable para almacenar la suma

            // Calcular la suma de los números anteriores
            for (int i = 1; i < numero; i++) {
                suma += i; // Sumar cada número que antecede al ingresado
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + numero + " es: " + suma);
        }
    }

