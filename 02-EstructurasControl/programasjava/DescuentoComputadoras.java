import javax.swing.*;

public class DescuentoComputadoras {
    public static void main(String[] args) {
        // Pedimos la cantidad de computadoras al usuario
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de computadoras a comprar:");
        int cantidad = Integer.parseInt(input); // Convertimos a entero

        double precioUnitario = 11000; // Precio de cada computadora
        double total = cantidad * precioUnitario; // Precio total sin descuento
        double descuento = 0; // Variable para almacenar el descuento

        // Aplicamos el descuento según la cantidad de computadoras compradas
        if (cantidad < 5) {
            descuento = total * 0.10; // 10% de descuento
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = total * 0.20; // 20% de descuento
        } else {
            descuento = total * 0.40; // 40% de descuento
        }

        double totalConDescuento = total - descuento; // Calculamos el total con descuento

        // Mostramos los resultados al usuario
        JOptionPane.showMessageDialog(null, "Total sin descuento: $" + total +
                "\nDescuento aplicado: $" + descuento +
                "\nTotal a pagar: $" + totalConDescuento);
    }
}

