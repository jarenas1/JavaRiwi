import java.util.Scanner;

public class uno {

    public static boolean primo(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2;i<=Math.sqrt(numero);i++){
            if (numero % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la el tope maximo de primos");
        int numero = scanner.nextInt();

        int j = 0;
        int cont = 2;
        while (j<numero){
            if (primo(cont)){
                System.out.println(cont);
                j++;
            }
            cont++;
        }
    }
}
