import java.util.Scanner;

public class nueve {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año");

        int year = scanner.nextInt();

        if (year%4==0){
            if (year%100==0){
                System.out.println("el año no es bisiesto");
            }
            else if(year%100 == 0 && year%400 == 0){
                System.out.println("Si es bisiesto");
            }
            else{
                System.out.println("El año es bisiesto");
            }
        }else{
            System.out.println("Es un año no bisiesto");
        }
    }
}
