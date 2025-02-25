import javax.swing.*;

public class DescuentoEscuela {
    public static void main(String[] args) {
        // Pedir el nivel educativo
        String nivel = JOptionPane.showInputDialog("Ingrese el nivel educativo (Preparatoria o Profesional):");

        // Pedir el promedio del alumno
        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del alumno:"));

        // Si es de preparatoria, pedimos el número de materias reprobadas
        int reprobadas = 0;
        if (nivel.equalsIgnoreCase("Preparatoria")) {
            reprobadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de materias reprobadas:"));
        }

        int unidades = 0;
        double descuento = 0;
        double costoUnidad = nivel.equalsIgnoreCase("Preparatoria") ? 180.0 / 5 : 300.0 / 5; // Costo por unidad

        // Determinar unidades y descuentos
        if (nivel.equalsIgnoreCase("Preparatoria")) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25;
            } else if (promedio >= 9 && promedio < 9.5) {
                unidades = 50;
                descuento = 0.10;
            } else if (promedio > 7 && promedio < 9) {
                unidades = 50;
                descuento = 0;
            } else if (promedio <= 7 && reprobadas <= 3) {
                unidades = 45;
                descuento = 0;
            } else if (promedio <= 7 && reprobadas >= 4) {
                unidades = 40;
                descuento = 0;
            }
        } else if (nivel.equalsIgnoreCase("Profesional")) {
            unidades = 55;
            descuento = promedio >= 9.5 ? 0.20 : 0;
        } else {
            JOptionPane.showMessageDialog(null, "Nivel educativo no válido.");
            return;
        }

        // Calcular costo total
        double costoTotal = unidades * costoUnidad;
        double descuentoAplicado = costoTotal * descuento;
        double totalPagar = costoTotal - descuentoAplicado;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Unidades permitidas: " + unidades +
                "\nCosto total antes del descuento: $" + costoTotal +
                "\nDescuento aplicado: $" + descuentoAplicado +
                "\nTotal a pagar: $" + totalPagar);
    }
}

