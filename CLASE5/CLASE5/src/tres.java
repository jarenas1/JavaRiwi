import java.util.Scanner;

public class tres {

    public static void contar(boolean sillas[][]){

        int dispo = 0;
        int ocupado = 0;
        for (int i = 0; i<5;i++){
            for (int j= 0; j<10;j++){
                if (sillas[i][j] == true){
                    dispo++;
                }else{
                    ocupado++;
                }
            }
        }
        System.out.println("Ocupadas: "+ocupado+". Disponibles "+dispo);
    }

    public static void reservarAndCancelar(boolean sillas[][]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a reservas y cancelaciones");
        System.out.println("Ingrese la fila de la silla");
        int fila = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la columna de la silla");
        int col = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese 1 para reservar o 2 para cancelar");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1){
            if (sillas[fila][col] ==true){
                sillas[fila][col] = false;
                System.out.println("Se reservo la silla "+fila+","+col+" exitosamente");

            }else{
                System.out.println("La silla esta ocupada");
            }
        } else if (option == 2) {
            if (sillas[fila][col] ==false){
                sillas[fila][col] = true;
                System.out.println("Se cancelo la reserva de la silla "+fila+","+col+" exitosamente");
            }else{
                System.out.println("La silla no esta reservada");
            }
        }
    }

    public static void disponible(boolean sillas[][]){
        System.out.println("Sillas disponibles");
        for (int i = 0; i<5;i++){
            for (int j= 0; j<10;j++){
                if (sillas[i][j] == true){
                System.out.println("Silla "+(i)+","+(j));
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean [][] sillas = new boolean[5][10];

        for (int i = 0; i<5;i++){
            for (int j= 0; j<10;j++){
                sillas[i][j]=true;
            }
        }
        System.out.println(sillas[1][1]);

        //--------------------------MENU------------------------------


        while(true){
            System.out.println("Ingrese una opcion 1. reservas/cancelacion   2. disponibles   3.cantidad dispo/ocup    4.salir");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    reservarAndCancelar(sillas);
                    break;
                case 2:
                    disponible(sillas);
                    break;
                case 3:
                    contar(sillas);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
