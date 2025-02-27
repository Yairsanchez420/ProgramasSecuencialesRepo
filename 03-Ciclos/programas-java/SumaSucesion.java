import javax.swing.*;

public class SumaSucesion {
    public static void main(String[] args) {
        //Necesitamos pedir el valor de n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor n:"));

        int suma = 0; //Variable para acumular la suma
        String sucesion = ""; //Variable que se usa para almacenar la sucesion como texto

        //El ciclo

        for (int i = 20; i <=n; i += 5){
            suma += i;

            sucesion += i;

            if (i + 5 <= n) {
                sucesion +=",";
            }
        }

        JOptionPane.showMessageDialog(null,"Sucesion: " + sucesion + "\nSuma total: " + suma);
    }
}
