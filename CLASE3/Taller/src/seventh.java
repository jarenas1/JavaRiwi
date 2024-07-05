import java.util.Scanner;

public class seventh {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println( "3. Multiplicacion " );
        System.out.println( "4. division " );

        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el primer numero");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo numero");
        int n2 = scanner.nextInt();


        switch (option){
            case 1:
                System.out.println("El resultado de la suma es "+(n1+n2));
                break;

            case 2:

                System.out.println("El resultado de la resta es "+(n1-n2));
                break;

            case 3:

                System.out.println("El resultado de la multiplicacion es "+(n1*n2));
                break;

            case 4:

                System.out.println("El resultado de la division es "+(n1/n2));
                break;

            default:
                System.out.println("Ingrese una opcion válida");


        }

    }
}
