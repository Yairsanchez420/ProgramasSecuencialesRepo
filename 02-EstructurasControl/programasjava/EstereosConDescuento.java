import javax.swing.*;
import java.util.jar.JarOutputStream;

public class EstereosConDescuento {
    public static void main(String[] args) {
        // Pedimos el precio del estéreo
        String inputPrecio = JOptionPane.showInputDialog("Ingrese el precio del estéreo:");
        double precio = Double.parseDouble(inputPrecio); // Convertimos a número

        // Pedimos la marca del estéreo
        String marca = JOptionPane.showInputDialog("Ingrese la marca del estéreo:");

        double descuento = 0; // Variable para guardar los descuentos

        // Si el precio es mayor o igual a 2000, aplicamos 10% de descuento
        if (precio >= 2000) {
            descuento += precio * 0.10;
        }

        // Si la marca es "NOSY", aplicamos un 5% de descuento adicional
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += precio * 0.05;
        }

        // Calculamos el precio con descuento
        double precioConDescuento = precio - descuento;

        // Aplicamos IVA (16%)
        double iva = precioConDescuento * 0.16;
        double precioFinal = precioConDescuento + iva;

        // Mostramos los resultados
        JOptionPane.showMessageDialog(null, "Descuento aplicado: $" + descuento +
                "\nPrecio con descuento: $" + precioConDescuento +
                "\nIVA (16%): $" + iva +
                "\nPrecio final a pagar: $" + precioFinal);
    }
}

