package tres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creamos una nueva cuenta
        Cuenta account = new Cuenta("1033232323", "Juan José", "Natural", "032320102032", 250000.00);

        double solicitud;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para retirar y 2 para añadir");
        int op = sc.nextInt();
        sc.nextLine();

        if (op == 1){
            System.out.println("Ingrese la cantidad a retirar");
            solicitud = sc.nextDouble();
            sc.nextLine();
            account.retirar(solicitud);
        } else if (op == 2) {
            System.out.println("Ingrese la cantidad a ingresar");
            solicitud = sc.nextDouble();
            sc.nextLine();
            account.meter(solicitud);
        }
    }
}
