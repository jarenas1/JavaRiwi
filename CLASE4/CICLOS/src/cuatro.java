public class cuatro {
    public static void main(String[] args){

        //MEDIO ROMBO
        for (int i = 1; i<= 4; i++){
            for (int j = 4; j>i;j--){
                System.out.print(" ");
            }

            for (int k = 1; k<(i*2);k++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4-1; i>=1 ;i--){

            //espacios

            for(int j = 4; j>i; j--){
                System.out.print(" ");
            }

            for (int k = 1; k<(i*2); k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
