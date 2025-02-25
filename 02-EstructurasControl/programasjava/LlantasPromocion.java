import javax.swing.*;

public class LlantasPromocion {
    public static void main(String[] args) {
        // Pedimos la cantidad de llantas al usuario
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de llantas a comprar:");
        int cantidad = Integer.parseInt(input); // Convertimos a entero

        double precioUnitario; // Variable para almacenar el precio por llanta

        // Aplicamos el precio según la cantidad de llantas compradas
        if (cantidad < 5) {
            precioUnitario = 300;
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioUnitario = 250;
        } else {
            precioUnitario = 200;
        }

        double totalPagar = cantidad * precioUnitario; // Calculamos el total a pagar

        // Mostramos los resultados al usuario
        JOptionPane.showMessageDialog(null, "Precio por llanta: $" + precioUnitario +
                "\nTotal a pagar: $" + totalPagar);
    }
}

