public class ConversionLibras2 {
    public static void main(String[] args) {
        // Declaración de constante
        final double FACTOR_CONVERSION=0.454;
        // Declaración de variables de tres números dobles a convertir

        double numero1=10.0;
        double numero2=50.0;
        double numero3=100.0;

        double c1=0.0;
        double c2=0.0;
        double c3=0.0;


        //Solicitar los 3 numeros a calcular
        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de numero 1: "));
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de numero 2: "));
        numero3= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de numero 3: "));

        String salida="";

        //Proceso de conversión

        c1 = numero1 / FACTOR_CONVERSION;
        c2 = numero2 / FACTOR_CONVERSION;
        c3= numero3/ FACTOR_CONVERSION;

        salida = numero1 + "kg"+ "en libras es: " + c1 +
                "\n" + numero2 +"kg " + "en libras es: " + c2 +
                "\n" + numero3 +"kg " + "en libras es: " + c3;


        JOptionPane.showMessageDialog(null, salida);


    }
}
