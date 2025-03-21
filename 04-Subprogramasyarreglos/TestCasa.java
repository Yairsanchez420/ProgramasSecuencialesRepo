package mx.edu.uttt.subprogrmas;

import javax.swing.*;

public class TestCasa {
    public static void main(String[] args) {

        String color ="";
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();


        casa1.establecerColor("Amarillo");
        color = "Roja";
        casa2.establecerColor(color);

        String salida = "Los resultados son: \n" + casa1.obtenerColor();

        JOptionPane.showMessageDialog(null, salida);
    }
}
