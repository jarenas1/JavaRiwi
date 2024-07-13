public class diez {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] reverse = new int[numbers.length];
        int contador = 0;
        for (int i = (numbers.length-1); i>=0; i--){

            reverse[contador] = numbers[i];
            contador++;

        }

        for (int num : reverse){
            System.out.println(num);
        }
    }
}
