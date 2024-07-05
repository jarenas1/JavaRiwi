import java.util.Scanner;

public class Catorce {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 1 para transofrmar Celsius to F o 2 para transformar F to C");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 1){
            System.out.println("Ingrese los grados C.");
            double c = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Esos son: "+((c*(9.0/5.0))+32)+" Grados F");

        } else if (option == 2) {
            System.out.println("Ingrese los grados F.");
            double f = scanner.nextDouble();
            scanner.nextLine();
            double graddosc = (f-32)*(5.0/9.0);
            System.out.println("Eso son "+graddosc+" C");
        }
    }
}
