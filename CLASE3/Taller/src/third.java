import java.util.Scanner;

public class third {
    public static void main( String[] args){

        Scanner scanner =new Scanner(System.in);

        double milla = 1.60934;

        System.out.println("Ingrese la cantidad de kilometros recorridos");

        double kilometres = scanner.nextDouble();

        System.out.println("Usted recorrio lo equivalente a "+ (kilometres/milla)+" millas");

    }
}
