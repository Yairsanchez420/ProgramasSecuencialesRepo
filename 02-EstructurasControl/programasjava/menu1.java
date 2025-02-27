
        import javax.swing.*;
            public class Menu1 {
            public static void main(String[] args) {
                //Declaracion de variables

                String opcion = "";
                String menu = "a) Fabrica\n" +
                        "b) Llantera\n" +
                        "c) Juego de preguntas\n" +
                        "d) Salir\n" +
                        "Elegir una opcion";

                opcion = JOptionPane.showInputDialog(menu);
                opcion = opcion.toUpperCase();

                switch (opcion) {
                    case "A":
                        double monto, numCompu, totalSinDesc, descuento, total;
                        String salida;

                        // Entrada de valores
                        numCompu = Double.parseDouble(JOptionPane.showInputDialog("Introducir el número de computadoras que se llevarán: "));
                        monto = Double.parseDouble(JOptionPane.showInputDialog("Introducir el precio de la computadora: "));

                        // Calculo del total sin descuento
                        totalSinDesc = numCompu * monto;

                        // Aplicación del descuento según la cantidad comprada
                        if (numCompu < 5) {
                            descuento = totalSinDesc * 0.10;
                        } else if (numCompu < 10) {
                            descuento = totalSinDesc * 0.20;
                        } else {
                            descuento = totalSinDesc * 0.40;
                        }

                        // Cálculo del total final
                        total = totalSinDesc - descuento;

                        // Proceso de salida
                        salida = "El precio de cada computadora es: $" + monto +
                                "\nNúmero de computadoras: " + numCompu +
                                "\nTotal sin descuento: $" + totalSinDesc +
                                "\nDescuento aplicado: $" + descuento +
                                "\nPrecio final con descuento: $" + total;

                        JOptionPane.showMessageDialog(null, salida);
                        break;

                    case "B":
                        //Declaracion de variables
                        int numLlantas=0;
                        double precio=0.0;
                        double total1=0.0;
                        String salida1="";

                        // Entrada de valores
                        numLlantas = Integer.parseInt(JOptionPane.showInputDialog("Introducir la cantidad de llantas : "));

                        // Aplicación del descuento según la cantidad comprada
                        if ( numLlantas < 5 ) {
                            precio=300;
                            total1= numLlantas * precio;

                        }else if (numLlantas>5 && numLlantas<10){
                            precio=250;
                            total1=numLlantas * precio;

                        }else if (numLlantas >10){
                            precio=200;
                            total1=numLlantas * precio;
                        }

                        // Proceso de salida
                        salida1 = "La cantidad de llantas adquiridas es: " + numLlantas +
                                "\nEl precio a pagar de cada llanta es: $ " + precio +
                                "\nEl total a pagar es: " + total1;

                        JOptionPane.showMessageDialog(null, salida1);
                        break;
                    case "C":
                        //Llamar al metodo
                        jugar();
                        break;
                }

            }
            public static void jugar(){

                //Creacion y uso de un metodo
                String pregunta= "¿Colon descubrio America?";
                String resp= JOptionPane.showInputDialog((pregunta + "Si/No"));
                if (resp.equalsIgnoreCase("Si")){
                    resp=JOptionPane.showInputDialog("¿La independencia fue en 1810?");
                    if (resp.equalsIgnoreCase("SI")){
                        resp=JOptionPane.showInputDialog("¿The doors fue un grupo de rock Americano?");
                        if (resp.equalsIgnoreCase("si")){
                            JOptionPane.showMessageDialog(null, "Has ganado.");

                        }else{
                            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido.");
                        }

                    }else{
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido.");
                    }

                }else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido.");
                }
            }
        }
    }
}
