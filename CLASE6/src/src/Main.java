public class Main {
    public static void main(String[] args) {

        /*Arrays Unidimensionales
    Un array unidimensional es una colección de elementos del mismo tipo almacenados en ubicaciones de memoria contiguas.

    Declaración

    tipoDeDato[] nombreDelArray;
    Ejemplo:

    int[] array;
    ----------------------------------------------------------------------------------
    Inicialización
    Puedes inicializar un array especificando su tamaño o directamente con valores.
---------------------------------------------------------------------------------------------
    Especificando el tamaño:

    array = new int[5];

    ---------------------------------------------------------------------------------------------
    Especificando valores:
    array = new int[]{1, 2, 3, 4, 5};

    ---------------------------------------------------------------------------------------------
    Llenado del Array

    for (int i = 0; i < array.length; i++) {
        array[i] = i * 2;
    }


    ---------------------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------------------
    Matrices Bidimensionales
    Una matriz bidimensional es una "matriz de matrices", lo que significa que cada elemento de una matriz es, a su vez, una matriz.

    Declaración

    tipoDeDato[][] nombreDeLaMatriz;

    Ejemplo:
    int[][] matriz;

    ---------------------------------------------------------------------------------------------
    Inicialización
    Puedes inicializar una matriz especificando su tamaño o directamente con valores.

    Especificando el tamaño:

    matriz = new int[filas][cols];

    ---------------------------------------------------------------------------------------------
    Especificando valores:

    matriz = new int[][]{
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    ---------------------------------------------------------------------------------------------
    Llenado de la Matriz

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = i + j;
        }
    }


    MATRIZ TRIDIMENCIONAL:

    Una matriz tridimensional se puede considerar como una "matriz de matrices de matrices". La sintaxis básica para declarar una matriz tridimensional es:

    tipoDeDato[][][] nombreDeLaMatriz;
------------------------------------------------------------------------------------------------


    Inicialización de una Matriz Tridimensional
    Hay dos formas principales de inicializar una matriz tridimensional: especificando directamente los valores o especificando el tamaño de cada dimensión.

    Inicialización Especificando el Tamaño
    Puedes inicializar una matriz tridimensional especificando el tamaño de cada dimensión. Por ejemplo, si queremos una matriz de 3x4x2:

    int[][][] matriz = new int[3][4][2];

    DONDE [caras(profundidad)][filas][columnas]

    Esto crea una matriz tridimensional con 3 bloques, cada uno conteniendo 4 filas y cada fila conteniendo 2 columnas.

    --------------------------------------------------------------------------------------------------------------------------------------------------------

    Inicialización Especificando Valores
    También puedes inicializar la matriz tridimensional especificando directamente los valores:

    int[][][] matriz = {
    {
        {1, 2}, {3, 4}, {5, 6}, {7, 8}
    },
    {
        {9, 10}, {11, 12}, {13, 14}, {15, 16}
    },
    {
        {17, 18}, {19, 20}, {21, 22}, {23, 24}
    }
};


PARA ACCEDER A LO DATOS ES IGUAL QUE EN TODOS, LLAMAMIS LA MATRIZ CON LOS CAMPOS Y NOS VA A TRAER EL VALOR AHI UBICADO
    .*/

        }
    }