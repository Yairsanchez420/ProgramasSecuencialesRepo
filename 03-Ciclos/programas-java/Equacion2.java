import javax.swing.*;
import java.beans.Introspector;

public class Equacion2 {
    public static void main(String[] args) {
        //Declaracion de variables

        double s =0.0;
        double x =0.0;
        int n = 0;
        double deno = 0.0;
        double supDeno = 0.0;
        int i=0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de fracciones a resolver"));

        i = 1;
        deno=1.0;
        supDeno=3.0;
        while (i<=n) {
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));

            if (i % 2 != 0) {
                s -= Math.pow(x, 3.0/supDeno)/deno;
            } else {
                s += Math.pow(x, 3.0/supDeno)/deno;
            }
            supDeno+=3;
            deno+=2;
            i++;
        }

        JOptionPane.showMessageDialog(null,"El resultado es: " + s);
    }
}
