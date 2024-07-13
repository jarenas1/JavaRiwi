import java.util.Scanner;

public class tres {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea obtener");
        int max = scanner.nextInt();
        scanner.nextLine();


//PRIMER Y SEGUNDO NUMERO DE LA SECUENCIA
        int l1 = 0;
        int k2 = 1;

        for (int i = 0; i<max;i++){
            if (i == 0) {
                //IMPRIMIMOS EL PRIMER NUMERO DE LA SECUENCIA
                System.out.println(l1);
            } else if (i == 1) {
                System.out.println(k2);
            } else {
                int fib = l1 + k2;
                System.out.println(fib);
                // Actualizar los valores de fib1 y fib2 haciendo así que se siga la secuencia
                l1 = k2;
                k2 = fib;
            }
        }
    }
}