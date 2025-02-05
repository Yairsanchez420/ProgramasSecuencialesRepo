import javax.swing.*;
import java.util.jar.JarOutputStream;

public class EstructurasControlP1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String opcion = "";
        String menu = "a)Juego\n" +
                "b)Fruteria\n" +
                "c)Laboratorio\n" +
                "d)Salir\n" +
                "Elegir una opcion: ";

        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
                //Llamar el metodo
                jugar();
                String pregunta = "Colon descubrio America?";
                String resp = JOptionPane.showInputDialog(pregunta + " Si/No");
                if (resp.equalsIgnoreCase("Si")) {
                    resp = JOptionPane.showInputDialog("La independencia de mexico fue en 1810?");
                    if (resp.equalsIgnoreCase("Si")) {
                        resp = JOptionPane.showInputDialog("The doors fue un grupo de rock Americano");
                        if (resp.equalsIgnoreCase("Si")) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
                }
                break;
            case "B":
                double cantKilos = 0.0;
                double precio = 0.0;
                String resultado = "";
                precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las manzanas"));
                cantKilos =  Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de las manzanas"));

            if (cantKilos>0.0 && precio>0.0){
                if (cantKilos>=0.0 && cantKilos<=2.0){
                    resultado = "El total a pagar es: " + (cantKilos * precio);
                } else if (cantKilos>=2.01 && cantKilos<=5.0){
                    double descuento = (cantKilos * precio) * 0.10;
                    resultado = "El total a pagar con un descuento(10%) " + descuento + "es: " + ((cantKilos * precio) - descuento);

                } else if (cantKilos>=5.01 && cantKilos<=10.0){
                    double descuento = (cantKilos * precio) * 0.15;
                    resultado = "El total a pagar con un descuento(15%) " + descuento + "es: " + ((cantKilos * precio) - descuento);

                }else{
                    double descuento = (cantKilos * precio) * 0.20;
                    resultado = "El total a pagar con un descuento(20%) " + descuento + "es: " + ((cantKilos * precio) - descuento);
                }

                JOptionPane.showMessageDialog(null,resultado);
            }else {
                if (cantKilos < 0.0) {
                    JOptionPane.showMessageDialog(null, "La cantidad de kilos no puede ser 0 o negativa");

                } else {
                    if (precio < 0.0) {
                        JOptionPane.showMessageDialog(null, "El precio no puede ser negativo");
                    }
                }

            }

                break;
            case "C":
                break;
            case "D":
                break;
            default:
                JOptionPane.showMessageDialog(null, "El programa ha terminado");


        }
    }


    public static void jugar() {
        String pregunta = "Colon descubrio America?";
        String resp = JOptionPane.showInputDialog(pregunta + " Si/No");
        if (resp.equalsIgnoreCase("Si")) {
            resp = JOptionPane.showInputDialog("La independencia de mexico fue en 1810?");
            if (resp.equalsIgnoreCase("Si")) {
                resp = JOptionPane.showInputDialog("The doors fue un grupo de rock Americano");
                if (resp.equalsIgnoreCase("Si")) {

                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido");
        }
    }
}

public static void