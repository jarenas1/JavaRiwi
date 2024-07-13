public class ocho {
    public static void main(String[] args) {

        /*Ejercicio 7: Transposición de una Matriz
Crea un programa en Java que calcule la transpuesta de una matriz
(intercambiar filas por columnas).*/

        int[][] m1 = new int[3][3];

        //CREAMOS LA MATRIZ SIMETRICA PARA EL EJEMPLO
        //fila 1
        m1[0][0] = 1;
        m1[0][1] = 2;
        m1[0][2] = 3;
        //Fila 2
        m1[1][0] = 2;
        m1[1][1] = 4;
        m1[1][2] = 5;
        //fila 3
        m1[2][0] = 3;
        m1[2][1] = 5;
        m1[2][2] = 6;

        //SACAMOS SU TRASPUESTA
        int[][] traspuesta = transponer(m1);
        System.out.println("ORIGINAL");
        imprimirMatriz(m1);
        System.out.println();
        System.out.println("TRASPUESTA");
        imprimirMatriz(traspuesta);
        comparar(traspuesta,m1);




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

    public static void comparar(int[][] traspuesta, int[][] matriz){
        boolean status = true;
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[0].length;j++){
                if (!(matriz[i][j]==traspuesta[i][j])){
                    status = false;
                }
            }
        }
        if (status){
            System.out.println("La matriz si es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }
    }
}