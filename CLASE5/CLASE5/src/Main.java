public class Main {
    public static void main(String[] args) {
        //ARRAY O LISTA

        //permite almacenar varios datos de un mismo tipo en una sola variable

        //HOMOGENIEDAD: mismo tipo de dato

        //TAMAÑO FIJO: una vez un array es creado no se puede modificar su tamaño, los que se pueden modificar son los arraylist

        //POSICIONES: accedemos a los elementos por medio de su posicion



        //--------------------CREAR UN ARRAY--------------------------

        //con datos quemados
        // type[] name={values}

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        //Acceder al array: array[posicion]
        //System.out.println(numeros[1]);

        //sin datos quemados
        //type[] name = new type[tamañoDelArray];    //COMIENZA DESDE 0, ASI QUE SI PONEMOS 2 POSICIONES VA A CREAR 0 Y 1

        int[] numbers = new int[3]; //IMPRIME UN ARRAY CON 3 POSICIONES, 0,1,2

        //ingresamos datos
        numbers[0]=9;
        numbers[1]=7;
        numbers[2]=8;

        //System.out.println(numbers[2]);


        //----------------ITERAR ARRAY-------------------------------

        //for     se usa cuando necesitamos tener el contador para ver en que iteracion vamos

        //CON EL LENGTH SABEMOS LONGITUD

        //for

        for (int i = 0; i<numeros.length;i++){
            System.out.println((i+1)+" "+ numeros[i]);
        }

        //FOR EACH

        for (int num : numeros){
            System.out.println(num); //num toma el valor de cada posicion del array y se imprime
        }

        //ARREGLOS UNIDIMENCIONALES: ARRAYS
        //ARREGLOS BIDIMENSIONALES: MATRICES


        //------------------------------MATRICES----------------------------------

        //crear

        //array[filas][columnas]       filas horizontales    columnas verticales

        //obtener dato
        //array[fila][columna]


        //añadir dato
        //array[fila][columna]= valor



        //CREAR UNA MATRIZ VACIA PARA METER COSAS

        int[][] matriz = new int[2][3];   //METEMOS EN EL PRIMER CORCHETE LA CANTIDAD DE FILAS, Y EN EL SEGUNDO LA CANTIDAD DE COLUMNAS

        //FILA 1:
        matriz[0][0]=3;
        matriz[0][1]=3;
        matriz[0][2]=3;

        //FILA 2:
        matriz[1][0]=3;
        matriz[1][1]=3;
        matriz[1][2]=3;


        //RECORRER CON FOR      debemos anidar los for

        for (int fila= 0; fila<2; fila++){
            System.out.println("fila"+fila);

            for (int columna = 0; columna<3;columna++){
                System.out.println(columna + "columna");

            }
        }

        //CON FOR EACH     debemos igual usar 2 bucles

        for (int[] fi : matriz){  //crea un array de cada fila
            for (int col : fi){ //itera el array que se creo de cada fila
                System.out.println(col);
            }
        }
    }
}