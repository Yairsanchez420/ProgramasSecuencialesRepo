import javax.print.attribute.standard.JobPriority;
import javax.swing.*;

public class SumaSucesionCuadrado {
    public static void main(String[] args) {
        //Pedimos el valor de N
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos N:"));

        int suma = 0;
        String sucesion = "";

        for (int i = 1; i <= N; i++){
            int cuadrado = i * i;
            suma += cuadrado;

            sucesion += cuadrado;

            if (i < N){
                sucesion += ",";
            }
        }

        JOptionPane.showMessageDialog(null,"Sucesion: " + sucesion + "\nSuma total: " + suma);
    }
}
