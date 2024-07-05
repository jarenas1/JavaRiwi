//Calculadora Básica

import java.util.Scanner;

public class first {
    public static void main (String[] args){
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingrese el primer numero");

        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el segundo numero");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("La suma de los 2 numeros es "+(number1+number2)+", La resta es "+(number1-number2)+", la multiplicacion es "+ number1*number2+" y la division es "+ number1/number2);

        scanner.close();
    }
}
