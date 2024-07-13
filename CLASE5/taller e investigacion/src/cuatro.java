import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {

        /*Ejercicio 4:   SOLUCION AL FINAL*/

        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        boolean ciclo = true;


//---------------------------------CREACION DE ARRAYS------------------------------------------
        String[] products = {"perro", "hamburguesa", "pizza", "pollo"};
        double[] prices = {10, 15, 8, 12};
        double[] countPrices = new double[4];
        String[] countProducts = new String[4];
//---------------------------------------------------------------------------------------------

        while(ciclo){
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. añadir");
            System.out.println("2. ver factura");
            System.out.println("3. salir");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1 -> añadir(products,prices,countPrices,countProducts,cantidad);
                case 2 -> factura(products,prices,countPrices,countProducts);
            }
        }

    }

    public static void añadir (String[] products, double[] prices, double[] countPrices, String[] countProducts, int cantidad){
        double acumulador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Ingrese un producto:");
        System.out.println("1. perros");
        System.out.println("2. hamburguesas");
        System.out.println("3. pizzas");
        System.out.println("4. pollos");

        int option = sc.nextInt() - 1;
        sc.nextLine();

        System.out.println("Ingrese la cantidad de " + products[option] + " que desea");
        cantidad = sc.nextInt();
        sc.nextLine();
        countProducts[option] = products[option];
        countPrices[option] = (prices[option] * cantidad);
    }

    public static void factura (String products[], double prices[], double countPrices[], String countProducts[]){
        double acumulador = 0;
        System.out.println("FACTURA");
        System.out.print("NOMBRE ");
        System.out.print(" CANTIDAD ");
        System.out.println(" PRECIO    ");

        for (String producto:countProducts){
            if (producto!=null){
                System.out.println();
                System.out.print(producto + "  ");

            }
        }
        for (int i = 0; i<4;i++ ){
            if (countPrices[i] != 0){
                System.out.print(prices[i] + "  ");
                System.out.println(countPrices[i]);
                for (double aPagar:countPrices){
                    acumulador += aPagar;
                }
                System.out.println();


                //SOLUCION DE ESTE PUNTO EN ESPECIFICO (ADICIONAR DESCUENTOS AL TOTAL)
                if (acumulador >= 1000){
                    acumulador = (acumulador-(acumulador*0.25));

                } else if (acumulador>=500 && acumulador<1000) {
                    acumulador = (acumulador-(acumulador*0.20));

                } else if (acumulador>=300 && acumulador<500) {
                    acumulador = (acumulador-(acumulador*0.15));

                }else if (acumulador>=200 && acumulador<500) {
                    acumulador = (acumulador-(acumulador*0.10));
                }
                System.out.println("TOTAL: "+acumulador);
            }
        }
    }
}
