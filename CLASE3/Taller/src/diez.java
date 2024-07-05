import java.util.Scanner;

public class diez {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de la cuenta");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el % de propina que desea dejar");
        double propina = scanner.nextDouble();

        double pago = ((propina*price)/100);

        System.out.println("Debe dejar "+pago+" de propina");


    }
}
