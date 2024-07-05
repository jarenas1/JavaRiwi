import java.util.Scanner;

public class second {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();

        if (age<18){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Usted es mayor de edad");
        }
        scanner.close();
    }
}
