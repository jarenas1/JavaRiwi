import java.util.Scanner;

public class trece {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double km = 1300;

        double tarifaBase = 5000;

        System.out.println("Ingrese la cantidad de kilometros del viaje");

        double distancia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("El precio del viaje es de: "+(tarifaBase+(km*distancia)));


    }
}
