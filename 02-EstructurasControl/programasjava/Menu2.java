import javax.swing.*;
public class Menu2 {
        public static void main(String[] args) {
            //Declaracion de variables

            //Creacion de menu interactivo
            String opcion = "";
            String menu = "a) ProveedorEstereos\n" +
                    "b) Fruteria\n" +
                    "c) Laboratorio\n" +
                    "d) Salir\n" +
                    "Elegir una opcion";

            opcion = JOptionPane.showInputDialog(menu);
            opcion = opcion.toUpperCase(); //Ignora si la letra es minuscula o mayuscula

            switch (opcion) {
                case "A":
                    //Llamar al metodo
                    estereos();
                    break;
                case "B":
                    //Declaracion de variables
                    double cantKilos = 0.0;
                    double precio = 0.0;
                    String resultado = "";

                    //Entrada de datos
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las manzanas: "));
                    cantKilos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de kilos de manzanas: "));

                    //Condiciones a cumplir
                    if (cantKilos > 0.0 && precio > 0.0) {
                        if (cantKilos >= 0.0 && cantKilos <= 2.0) {
                            resultado = "El total a pagar es: " + (cantKilos * precio);
                        } else if (cantKilos >= 2.01 && cantKilos <= 5) {
                            double descuento = (cantKilos * precio) * 0.10;
                            resultado = "El total a pagar con un descuento(10%) " + descuento + "es: " + (cantKilos * precio - descuento);
                        } else if (cantKilos >= 5.01 && cantKilos <= 10.0) {
                            double descuento = (cantKilos * precio) * 0.15;
                            resultado = "El total a pagar con un descuento(15%) " + descuento + "es: " + (cantKilos * precio - descuento);
                        } else {
                            double descuento = (cantKilos * precio) * 0.20;
                            resultado = "El total a pagar con un descuento(20%) " + descuento + "es: " + (cantKilos * precio - descuento);
                        }
                        JOptionPane.showMessageDialog(null, resultado); //Salida de datos

                    } else { //Validacion de datos solo positivos
                        if (cantKilos < 0.0) {
                            JOptionPane.showMessageDialog(null, "La cantidad de kilos no puede ser negativo ni 0");
                        }

                        if (precio < 0.0) {
                            JOptionPane.showMessageDialog(null, "El precio no puede ser negativo ni 0");
                        }
                    }
                    break;
                case "C":
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
            }

        }

        public static void estereos() {

            //Creacion y uso de metodo
            //Declaracion de variables
            double precio = 0.0;
            double descuento = 0.0;
            double totalConDescuento = 0.0;
            double iva = 0.0;
            double totalFinal = 0.0;
            String marca = "";

            //Entrada de datos
            precio = Double.parseDouble(JOptionPane.showInputDialog("Introducir el precio del estereo: "));

            //Condiciones a cumplir
            if (precio >= 2000) {
                descuento += precio * 0.10;
            }
            //Salida de datos
            marca = (JOptionPane.showInputDialog("Introducir el nombre de la marca del estereo "));

            //Condiciones a cumplir
            if (marca.equalsIgnoreCase("NOSY")) {
                descuento += (precio - descuento) * 0.05;
            }

            //Resolucuion de procesos
            totalConDescuento = precio - descuento;

            iva = totalConDescuento * 0.16;

            totalFinal = totalConDescuento + iva;

            //Salida de datos
            JOptionPane.showMessageDialog(null, "Precio final es: $" + String.format("%.2f", totalFinal));
        }

    }

