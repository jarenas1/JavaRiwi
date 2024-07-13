public class uno {
    public static void main(String[] args){

        double[] notas = {3.5,4.5,2.3,5.0,5.0,4.0,4.0,2.5,3.7,3.2};
        double acumulador = 0;

        for ( double nota:notas){
            acumulador += nota;
        }
        System.out.println(acumulador/(notas.length));
    }
}
