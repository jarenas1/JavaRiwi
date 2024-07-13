import java.util.Scanner;

public class dos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[5];

        System.out.println("Ingrese el primer numero");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el segundo numero");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el tercer numero");
        int n3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el cuarto numero");
        int n4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el quinto numero");
        int n5 = scanner.nextInt();
        scanner.nextLine();


        //AÑADIR DATOS AL ARRAY:

        numeros[0]=n1;
        numeros[1]=n2;
        numeros[2]=n3;
        numeros[3]=n4;
        numeros[4]=n5;

        int may = numeros[0];
        int men = numeros[0];

        for (int i = 0; i<numeros.length; i++){
            if (numeros[i]>may){
                may=numeros[i];
            }if (numeros[i]<men){
                men=numeros[i];
            }
        }

        System.out.println("mayor: "+ may);
        System.out.println("Menor: "+men);


    }
}
