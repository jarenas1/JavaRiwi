import java.util.Scanner;

public class eleventh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        // Ordenamiento usando operador ternario
        int menor = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
        int mayor = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        int medio = (num1 != menor && num1 != mayor) ? num1 : (num2 != menor && num2 != mayor) ? num2 : num3;

        System.out.println("Los números ordenados de menor a mayor son: " + menor + ", " + medio + ", " + mayor);


    }
}
