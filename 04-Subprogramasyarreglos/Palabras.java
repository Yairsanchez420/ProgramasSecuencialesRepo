package mx.edu.uttt.arreglos;

public class Palabras {
    public static void main(String[] args) {
        String pa = "Oso";
        imprimirPalabra(pa);

    }

    public static void imprimirPalabra (String word){
        for (int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

    }
}
