import java.util.Scanner;

public class uno {
    public static void main (String[] args){

        /*Ejercicio 1: Menú interactivo.
        Este ejercicio propone la creación de un programa que presente al
        usuario un menú interactivo para realizar operaciones matemáticas
        básicas como suma, resta, multiplicación y división.*/

        boolean status = true;

        while(status) {

            Scanner sc = new Scanner(System.in);
            System.out.println("bienvenido, ingrese una opcion:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. salir");

            int option = sc.nextInt();
            sc.nextLine();

            if (option==5){
                System.out.println("Gracias por usar la calculadora");
                break;
            }

            System.out.println("Ingrese el numero 1");
            double n1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese el numero 2");
            double n2 = sc.nextDouble();
            sc.nextLine();

            switch (option){
                case 1:
                    suma(n1,n2);
                    break;
                case 2:
                    resta(n1, n2);
                    break;
                case 3:
                    multiplicacion(n1,n2);
                    break;
                case 4:
                    division(n1,n2);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
        }
    }

    public static void suma (double n1, double n2){
        double operacion = n1+n2;
        System.out.println("suma = "+operacion);
    }

    public static void resta (double n1, double n2){
        double operacion = n1-n2;
        System.out.println("resta = "+operacion);
    }

    public static void multiplicacion (double n1, double n2){
        double operacion = n1*n2;
        System.out.println("multiplicacion = "+operacion);
    }

    public static void division (double n1, double n2){
        double operacion = n1/n2;
        System.out.println("division = "+operacion);
    }

}
