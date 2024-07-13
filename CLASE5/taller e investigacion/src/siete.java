public class siete {
    public static void main(String[] args) {

        /*Ejercicio 7: Transposición de una Matriz
Crea un programa en Java que calcule la transpuesta de una matriz
(intercambiar filas por columnas).*/

        int[][] m1 = new int[3][3];

        //CREAMOS LA MATRIZ UNICIAL
        //fila 1
        m1[0][0] = 1;
        m1[0][1] = 1;
        m1[0][2] = 1;
        //Fila 2
        m1[1][0] = 2;
        m1[1][1] = 2;
        m1[1][2] = 2;
        //fila 3
        m1[2][0] = 3;
        m1[2][1] = 3;
        m1[2][2] = 3;

        int[][] traspuesta = transponer(m1);

        imprimirMatriz(m1);
    }

    public static int[][] transponer(int[][] m1) {
        int filas = m1.length;
        int columnas = m1[0].length;
        int[][] transpuesta = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = m1[i][j];
            }
        }

        return transpuesta;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}