import javax.swing.*;

public class TeatroDescuento {
    public static void main(String[] args) {

        double precioEntrada = 100;
        double totalDescontado = 0;

        String respuesta;

        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));

            double descuento = 0;

            if ( edad >= 5 && edad <= 14){
                descuento = 0.35;
            } else if (edad >= 15 && edad <= 19){
                descuento = 0.25;
            } else if (edad >= 20 && edad <=45){
                descuento = 0.10;
            } else if (edad >= 46 && edad <= 65){
                descuento = 0.25;
            } else if (edad >=66){
                descuento = 0.35;

            }

            double dineroDescontado = precioEntrada * descuento;
            totalDescontado += dineroDescontado;

            respuesta = JOptionPane.showInputDialog("Quieres meter a otro cliente? si/no").toLowerCase().trim();
        } while (respuesta.equalsIgnoreCase("si"));

        JOptionPane.showMessageDialog(null,"El total de dinero que el teatro deja de recibir es: $" + totalDescontado);
    }
}
