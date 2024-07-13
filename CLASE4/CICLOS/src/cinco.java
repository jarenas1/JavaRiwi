import java.util.Scanner;

public class cinco {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea conocer el factorial");
        int number = scanner.nextInt();
        scanner.nextLine();

        int acumulador = 1;
        for(int i = 1; i<=number; i++) {

            acumulador = acumulador * i;



        }
        System.out.println(acumulador);
    }
}
