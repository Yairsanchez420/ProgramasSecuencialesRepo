import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu = "";
        String opcion = "";
        boolean sentinel = true;

        //Creacion del menu

        menu = "Menu Principal\n" +
                "1) Promedio Calificaciones (for)\n" +
                "2) Vendedores (While)\n" +
                "3) Tienda (do-while)\n" +
                "4) Salir" +
                "\nElegir opcion: ";
        do {


            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    int numCalif = 0;
                    Double calif = 0.0;
                    Double promedio = 0.0;

                    //Solicitar el numero de variables
                    numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones"));
                    for (int i = 1; i <= numCalif; i++) {
                        //Solicitar calificaciones
                        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

                        //Acumular Calificaciones
                        promedio +=calif;
                    }

                    promedio/=numCalif;

                    JOptionPane.showMessageDialog
                            (null,"El promedio del alumno es: " + promedio);
                    break;
                case "2":
                    String nombre = "";
                    int numeroVendedores=0;
                    double sueldoBase= 0.0;
                    double comision=0.0;
                    double sueldoTotal=0.0;
                    String salida = "";
                    double v1 = 0.0, v2 = 0.0, v3 =0.0;
                    v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1"));
                    v2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2"));
                    v3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3"));

                    comision = (v1 + v2 + v3) * 0.10;
                    sueldoTotal = sueldoBase + comision;

                    numeroVendedores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de vendedores"));

                    sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo base "));

                    salida = "Nombre         Comision         Sueldo Total\n";

                    int i =1;
                    while (i<=numeroVendedores){
                        nombre = JOptionPane.showInputDialog("introduce el nombre del vendedor " + i);

                        salida+= nombre + "          " + comision + "        " + sueldoTotal + "\n";
                        i++;
                    }

                    JOptionPane.showMessageDialog(null,salida);

                    break;
                case "3":
                    //Tienda de bolitas
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    String respuesta = "", resultado="";
                    boolean sentinel2 = true;
                    double totalCompra = 0.0, descuento=0.0, importe =0.0, total =0.0;
                    String tipoBolita = "";
                    String menuBolitas = "Tombola\n" +
                                         "a)Bolita Roja\n" +
                                         "b)Bolita Amarilla\n" +
                                         "c)Bolita Blanca\n" +
                                         "Elegir opcion";
                    resultado = "Total de Ventas\n" +
                                "Total a Pagar           " + "Descuento          " + "Importe    \n";
                    do {
                        totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de la compra"));

                        tipoBolita = JOptionPane.showInputDialog(menuBolitas);

                        if (tipoBolita.equalsIgnoreCase("a")
                            || tipoBolita.equalsIgnoreCase("b")
                            || tipoBolita.equalsIgnoreCase("c")
                           )
                        {
                            if (tipoBolita.equalsIgnoreCase("a")) {
                                descuento = totalCompra * 0.40;
                            } else if (tipoBolita.equalsIgnoreCase("b")) {
                                descuento = totalCompra * 0.25;
                            } else {
                                descuento = 0.0;

                            }

                            importe = totalCompra - descuento;
                            total+=importe;

                            resultado+= totalCompra + "        " + descuento + "        " + importe + "\n";

                        }else{
                            JOptionPane.showMessageDialog(null,"Bolita no validsa");
                        }

                        salida = JOptionPane.showInputDialog("Deseas cerrar la caja si/no");

                        if (salida.equalsIgnoreCase("si")){
                            sentinel2 = false;
                        }
                    }while (sentinel2);

                    resultado+="Total: " + total;
                    JOptionPane.showMessageDialog(null,resultado);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Opcion 4");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        }while (sentinel);
    }
}