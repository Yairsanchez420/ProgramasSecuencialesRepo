package mx.edu.uttt.subprogrmas;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Saludo {

    public static void main (String[] args) {
//        saludar();
//        saludar2("Arcadia");
//        saludar2("Artemio");
//        saludar2("Harumi tiene mucho sueno");
//        saludar2("Hector tambien tiene mucho sueno");
//        saludarConNombre("Yair",24300653);
//        saludarConNombre("Marisol",24300654);

        //Declaracion de variables
        String nombre = "";
        int matricula = 0;

        nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu matricula"));

        saludarConNombre(nombre, matricula);

        nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu matricula"));

        saludarConNombre(nombre, matricula);

        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        String saludo = saludarConContestacion(nombre, edad2);
        System.out.println(saludo);



    }

    //Metodo de tipo estatico que non retorna nada
    // Y no recibe parametros
    public static void saludar () {
        System.out.println("Hola Mundo ");
    }

    //Metodo estatico que no retorna nada (void) y recibe
    //un parametro de tipo string
    public static void saludar2 (String nombre){
        System.out.println("Hola mundo " + nombre);
    }

    public static void saludarConNombre(String nombre, int matricula){
        String cadena = "Hola Mundo soy: " + nombre + " con matricula: " + matricula;
        System.out.println(cadena);
    }

    public static String saludarConContestacion(String nombre, int edad){
        String saludar = "Hola " + nombre +
                " estas a punto de reprobar programacion a tus "
                + edad;
        return saludar;
    }
}
