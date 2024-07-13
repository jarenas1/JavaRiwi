import java.util.Scanner;

public class dos {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea conocer su tabla de multiplicar");
        int numero = scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<=10;i++){
            System.out.println(i + " * " + numero + " = " +(numero*i));
        }
    }
}
