package mx.edu.uttt.subprogrmas;

import javax.swing.JOptionPane;

public class Casa2 {

    public String color;

    public static void main(String[] args) {
        Casa2 casa1 = new Casa2();

        casa1.establecerColor("Verde");
        String salida = "El resultado es: " + casa1.obtenerColor();

        JOptionPane.showMessageDialog(null,salida);
    }

    public void establecerColor(String newColor){
        color = newColor;
    }

    public String obtenerColor(){
        return color;
    }
}
