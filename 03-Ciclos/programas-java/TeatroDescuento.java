import javax.swing.*;

public class TeatroDescuento {
    public static void main(String[] args) {

        //Declaramos las variables
        double precioEntrada = 100;
        double totalDescontado = 0;

        String respuesta;

        //ciclo do-while para el problema
        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));

            double descuento = 0;

            if ( edad >= 5 && edad <= 14){
                descuento = 0.35;
            } else if (edad >= 15 && edad <= 19){
                descuento = 0.25;
            } else if (edad >= 20 && edad <=45){
                descuento = 0.10;
            } else if (edad >= 46 && edad <= 65){
                descuento = 0.25;
            } else if (edad >=66){
                descuento = 0.35;

            }

            double dineroDescontado = precioEntrada * descuento;
            totalDescontado += dineroDescontado;

            respuesta = JOptionPane.showInputDialog("Quieres meter a otro cliente? si/no").toLowerCase().trim();
        } while (respuesta.equalsIgnoreCase("si"));

        JOptionPane.showMessageDialog(null,"El total de dinero que el teatro deja de recibir es: $" + totalDescontado);
    }
}

//int suma = 5 + 3;      // 8
//int resta = 10 - 4;    // 6
//int multiplicacion = 6 * 3; // 18
//double division = 10.0 / 4.0; // 2.5
//int modulo = 10 % 3;   // 1 (Residuo de la división)
//
//double potencia = Math.pow(2, 3);  // 2^3 = 8
//double raizCuadrada = Math.sqrt(16); // √16 = 4
//double raizCubica = Math.cbrt(27);  // ∛27 = 3
//double seno = Math.sin(Math.toRadians(30));  // sin(30°)
//double coseno = Math.cos(Math.toRadians(45)); // cos(45°)
//double tangente = Math.tan(Math.toRadians(60)); // tan(60°)
//double valor = 5.67;
//int redondeoArriba = (int) Math.ceil(valor);  // 6
//int redondeoAbajo = (int) Math.floor(valor);  // 5
//int redondeoNormal = (int) Math.round(valor); // 6
//int absoluto = Math.abs(-10); // 10
//int mayor = Math.max(10, 20);  // 20
//int menor = Math.min(10, 20);  // 10
//double aleatorio = Math.random(); // Número entre 0.0 y 1.0
//int aleatorioEntero = (int) (Math.random() * 10 + 1); // Número entre 1 y 10
//double radianes = Math.toRadians(180);  // Convierte 180° a radianes
//double grados = Math.toDegrees(Math.PI); // Convierte PI radianes a grados
//fori → Crea un bucle for automáticamente.
// foreach → Genera un bucle for-each.
//ifn → Crea if (variable == null) {} para verificar nulos.
//inn → Crea if (variable != null) {} para evitar errores de null.

