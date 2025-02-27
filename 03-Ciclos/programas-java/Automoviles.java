import javax.swing.*;

public class Automoviles {
    public static void main(String[] args) {

        //Declarar variables

        int amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;



        int totalAutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero total de autos"));

        while (totalAutos<=0){
            totalAutos = Integer.parseInt(JOptionPane.showInputDialog("Numero invalio ingrese un numero mayor a 0:"));
        }
        int contador = 0;


        while (contador < totalAutos){
            int digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ultimo digito de la placa del auto: "));

            if (digito<0 || digito >9){
                JOptionPane.showMessageDialog(null,"Numero invalido");
                continue;
            }

            if (digito == 1 || digito ==2){
                amarilla++;
            } else if (digito == 3 || digito == 4) {
                rosa++;
            } else if (digito == 5 ||digito ==6) {
                roja++;
            } else if (digito == 7 || digito ==8) {
                verde++;
            } else {
                azul++;
            }
            contador++;
        }

        String resultado = "Resultados:\n" +
                            "Amarilla: " + amarilla + "\n" +
                            "Rosa: " + rosa + "\n" +
                            "Roja: " + roja + "\n" +
                            "Verde: " + verde + "\n" +
                            "Azul: " + azul;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
