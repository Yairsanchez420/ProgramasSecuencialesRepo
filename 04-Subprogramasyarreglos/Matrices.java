package mx.edu.uttt.arreglos;

public class Matrices {
    public static void main(String[] args) {
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][2];

        int m3[][];
        m3 = new int[2][4];

        double m4[][] = {{1.5, 2.6, 3.6}, {1.3, 22.6, 12.5}};
        imprimir(m4);


    }

    public static void imprimir(int[][] m) {
        for (int fila = 0; fila < m.length; fila++) {
            for (int colum = 0; colum < m[fila].length; colum++) {
                System.out.print("| " + m[fila][colum] + " |");
            }
            System.out.println();
        }
    }

    public static void imprimir(double[][] m) {
        for (int fila = 0; fila < m.length; fila++) {
            for (int colum = 0; colum < m[fila].length; colum++) {
                System.out.print("| " + m[fila][colum] + " |");
            }
            System.out.println();
        }
    }
}
