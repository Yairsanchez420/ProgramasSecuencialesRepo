import javax.swing.*;
import java.util.concurrent.ThreadPoolExecutor;

public class AreaCirculo {
    public static void main(String[] args) {
        final double PI=3.14;
        double a=0.0, r=0.0;

        r= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio: "));
        a= PI*Math.pow(r,2);

        System.out.println("El area swl circulo con radio " + r + "es" + a);

//
//        double radio=.0, area=0.0;
//        final double PI = 3.1416;
//
//        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: "));
//        area = PI * Math.pow(radio,2);
//
//        salida = "El area del radio"

    }
}
