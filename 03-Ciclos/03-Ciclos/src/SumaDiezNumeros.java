import javax.swing.*;

public class SumaDiezNumeros {
    public static void main(String[] args) {

        double suma = 0;

        for (int i = 1; i <=10 ; i++) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero " + i + ":"));
            suma += numero;
        }

        JOptionPane.showMessageDialog(null,"La suma de los 10 numero es: " + suma);
    }
}
