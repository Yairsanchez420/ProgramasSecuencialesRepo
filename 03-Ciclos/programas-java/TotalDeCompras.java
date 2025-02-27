import javax.swing.*;

public class TotalDeCompras {
    public static void main(String[] args) {

            //Declaracion de variables
            double totalCompra = 0;
            String respuesta;

            do {
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este artículo:"));

                double totalArticulo = precio * cantidad;
                totalCompra += totalArticulo; // Sumamos al total de la compra


                respuesta = JOptionPane.showInputDialog("¿Desea ingresar otro artículo? (Sí/No)").trim();
            } while (respuesta.equals("sí"));


            JOptionPane.showMessageDialog(null, "El total de su compra es: $" + totalCompra);
        }
    }
