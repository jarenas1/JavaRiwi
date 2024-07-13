import java.util.Scanner;

public class cinco {
    public static void main (String[] args){

        /*Ejercicio 5: Busca palabras.
Un programa que permita al usuario ingresar un texto y luego le da la
opción de buscar una palabra específica, mostrando como resultado
el rango de posiciones donde se encontró la palabra exacta. (Sin darle
importancia a mayúsculas o minúsculas)*/


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = sc.nextLine().toLowerCase();

        System.out.println("Ingrese la palabra que desea buscar");
        String palabra = sc.nextLine().toLowerCase();

        String[] palabras = frase.split(" ");

        for (int i = 0; i< palabras.length; i++){
            if (palabras[i].equals(palabra)){
                System.out.println("La palabra "+palabra+" se encuentra en la cadena en la posicion "+i);
            }
        }
    }
}
