import javax.swing.*;

public class PromedioMasaDeAire {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de vehiculos:"));
        double sumaMasas = 0;

        for (int i = 1; i <= n; i++){

            double presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presion del vehiculo " + i + " (En las unidades adecuadas):"));
            double volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen del vehiculo " + i + " (En las unidades adecuadas):"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatrura del vehiculo " + i + " (En grados Fahrenheit):"));

            //Formula calcular la masa

            double masa = (presion * volumen) / (0.37 * (temperatura + 460));

            //Acumular la masa
            sumaMasas += masa;

        }

        double promedioMasas = sumaMasas / n;

        //Mostrar el resultado

        JOptionPane.showMessageDialog(null,"El promedio de la masa de aire de los neumaticos es: " + promedioMasas + " unidades de masa." );

    }
}
