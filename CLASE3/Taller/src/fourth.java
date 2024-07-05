import java.util.Scanner;

public class fourth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese su estatura en metros");
        double altura = scanner.nextDouble();

        System.out.println("su IMC es de"+(altura*peso));

    }
}
