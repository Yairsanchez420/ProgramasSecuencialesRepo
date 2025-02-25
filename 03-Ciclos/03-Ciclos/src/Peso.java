import javax.swing.*;

public class Peso {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de personas:"));

        int totalNinos = 0, totalJovenes = 0, totalAdultos = 0, totalViejos = 0;

        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;

        for (int i = 1; i <= n; i++){
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + i + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso (kg) de la persona " + i + ":"));

            if (edad >= 0 && edad <= 12) {
                sumaNinos += peso;
                totalNinos++;
            } else if (edad >= 13 && edad <= 29){
                sumaJovenes += peso;
                totalJovenes++;
            } else if (edad >= 30 && edad <= 59){
                sumaAdultos += peso;
                totalAdultos++;
            } else if (edad >= 60) {
                sumaViejos += peso;
                totalViejos++;
            }
        }

        String resultado = "Promedios de peso por categorias:\n";
        resultado += "Ninos: " + (totalNinos > 0 ? (sumaNinos / totalNinos) + "kg" : "No hay datos") + "\n";
        resultado += "Jovenes: " + (totalJovenes > 0 ? (sumaJovenes / totalJovenes) + "kg" : "No hay datos") + "\n";
        resultado += "Adultos: " + (totalAdultos > 0 ? (sumaAdultos / totalAdultos) + "kg" : "No hay datos") + "\n";
        resultado += "Viejos: " + (totalViejos > 0 ? (sumaViejos / totalViejos) + "kg" : "No hay datos") + "\n";

        JOptionPane.showMessageDialog(null,resultado);
    }
}
