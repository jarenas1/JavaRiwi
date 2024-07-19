package uno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CREAMOS EL OBJETO

        Libro libro1 = new Libro("Antony", "2020/09/10", false, "eloy feo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 1 para prestar o 2 para devolver");
        int option = scanner.nextInt();
        scanner.nextLine();

        //LLamamos el metodo
        libro1.Prestar(option);

        //VERIFICAR QUE EL ESTADO DEL LIBRO CAMBIO
        System.out.println(libro1.getPrestado());



    }
}
