import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //------------------------creacion de la matriz--------------------------------------


        System.out.println("Ingrese la cantidad de empleados del taller");
        int empleados = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la cantidad de trabajos");
        int trabajos = scanner.nextInt();
        scanner.nextLine();

        //CREE 5 COLUMNAS PORQUE SEGUN YO Y VARIOS COMPAÑEROS CON 4 NO FUNCIONA
        String[][][] data = new String[empleados][2][5];

        if (trabajos>empleados){
            return;
        }

        //---------------LLENAMOS LA MATRIZ---------------------------------

        for (int i = 0; i< trabajos;i++) {
            System.out.println("Ingrese el nombre del empleado numero " + (i + 1));
            String empleado = scanner.nextLine();

            //metemos el empleado a la fila de carros y a la de motos
            data[i][0][0] = empleado;
            data[i][1][0] = empleado;

            System.out.print("Ingrese el tipo de vehículo (Moto/Carro): ");
            String tipo = scanner.nextLine().toLowerCase();
            int type = tipo.equals("moto") ? 0 : 1;

            System.out.print("Ingrese la marca: ");
            String brand = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el modelo: ");
            String model = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el año: ");
            String year = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el estado (Pendiente/En reparación/Reparado): ");
            String status = scanner.nextLine().toLowerCase();

            //INGRESAMOS LOS DATOS A LA MATRIZ
            data[i][type][1] = brand;
            data[i][type][2] = model;
            data[i][type][3] = year;
            data[i][type][4] = status;
        }

        //--------------------MENU----------------------------
        boolean menu = true;

        while (menu){
            System.out.println("Ingrese una opcion");
            System.out.println("1. listar  2. ver por estado  3. buscar  4. modificar  5. salir");
            int op = scanner.nextInt();

            switch (op){
                case 1 -> listar(trabajos, data);
                case 2 -> unidades(trabajos, data);
                case 3 -> buscar(trabajos, data);
                case 4-> modificar(trabajos, data);
                case 5 -> menu = false;
                default -> System.out.println("Ingrese una opcion valida");
            }

        }
    }
    //METODO PARA LISTAR LOS VEHICULOS
    public static void listar(int trabajos, String[][][] data){
        System.out.println("LISTA DE VEHICULOS");
        for (int i = 0; i<trabajos; i++){
            for (int j = 0; j<2;j++){
                if (data[i][j][1]!=null){

                    System.out.println("mecanico: "+data[i][j][0]);
                    System.out.println();
                    System.out.println("tipo: "+(j == 0 ? "moto": "carro"));
                    System.out.println();
                    System.out.println("marca: "+data[i][j][1]);
                    System.out.println();
                    System.out.println("modelo: "+data[i][j][2]);
                    System.out.println();
                    System.out.println("año: "+data[i][j][3]);
                    System.out.println();
                    System.out.println("estado: "+data[i][j][4]);

                }
            }
        }

    }
    //METODO PARA VER LA CANTIDAD DE VEHICULOS EN CADA ESTADOJ
    public static void unidades(int trabajos, String[][][] data){
        int pendiente = 0;
        int reparacion = 0;
        int reparado = 0;


        System.out.println("Contador de vehiculos");
        for (int i = 0; i<trabajos; i++){
            for (int j = 0; j<2;j++){
                if (data[i][j][1]!=null){
                    if(data[i][j][4].equals("pendiente")){
                        pendiente++;
                    } else if (data[i][j][4].equals("en reparacion")) {
                        reparacion++;
                    }else{
                        reparado++;
                    }
                }
            }
        }
        System.out.println("pendientes: "+pendiente+" en reparacion: "+reparacion+" reparado: "+reparado);

    }

    public static void buscar(int trabajos, String[][][] data){
        Scanner scanner = new Scanner(System.in);
        System.out.println("BUSCAR VEHICULO POR MARCA Y MODELO");
        System.out.print("Ingrese la marca del vehículo a buscar: ");
        String marcaBuscar = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el modelo del vehículo a buscar: ");
        String modeloBuscar = scanner.nextLine().toLowerCase();
        boolean estado = false;

        for (int i = 0; i<trabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (data[i][j][1] != null) {
                    if (data[i][j][1].equals(marcaBuscar) && data[i][j][2].equals(modeloBuscar)){
                        estado = true;
                    }
                }
            }
        }
        if (estado){
            System.out.println("VEHICULO ENCONTRADO");
        }else {
            System.out.println("VEHICULO NO ENCONTRADO");
        }
    }

    public static void modificar(int trabajos, String[][][] data){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MODIFICAR ESTADO DE VEHICULO");
        System.out.print("Ingrese la marca del vehículo: ");
        String marcaBuscar1 = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modeloBuscar1 = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese el nuevo estado (Pendiente/En reparación/Reparado): ");
        String newStatus = scanner.nextLine();

        for (int i = 0; i<trabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (data[i][j][1] != null) {
                    if (data[i][j][1].equals(marcaBuscar1) && data[i][j][2].equals(modeloBuscar1)){
                        data[i][j][4] = newStatus;
                    }else {
                        System.out.println("Vehiculo no encontrado");
                    }
                }
            }
        }
    }
}
