import java.util.Scanner;

public class fifth {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double number = scanner.nextDouble();

        if (number < 0){
            if (number%2 == 0){
                System.out.println("El numero es negativo y es par");
            }else{
                System.out.println("El numero es negativo e impar");
            }
        } else if (number>0) {

            if (number%2 == 0){
                System.out.println("El numero es positivo y es par");

            }else{
                System.out.println("El numero es positivo e impar");
            }
        }else{
            System.out.println("El numero es 0");
        }
    }
}
