import java.util.Scanner;

public class diezysiete {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //RECIBIMOS UN CARACTER POR PARTE DEL USUARIO
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        if (vocal(caracter)) {
            System.out.println("El carácter es una vocal.");
        } else if (consonante(caracter)) {
            System.out.println("El carácter es una consonante.");
        } else {
            System.out.println("El carácter es un carácter especial.");
        }
    }

    //CREAMOS EL METODO VOCAL PARA VER SI ES UNA VOCAL
    public static boolean vocal(char i) {
        i = Character.toLowerCase(i);  //PASAMOS EL CARACTER A MINUSCULA

        //COMPARAMOS SI ES UNA VOCAL, SI SI ES DEVUELVE TRUE
        return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';
    }

    //CREAMOS UN METODO PARA VERIFICAR SI ES UNA CONSONANTE TENIENDO EN CUENTA QUE SI NO ES VOCAL ES CONSONANTE
    public static boolean consonante(char i) {
        i = Character.toLowerCase(i); //PASAMOS A MINUSCULA

        //ACA MIRAMOS SI ESTA EN EL RANGO DE A Y Z, DEVOLVIENDO ASI TRUE, Y VERIFICAMOS TAMBIEN SI NO ES UNA VOCAL, SI ESTA EN EL RANGO Y NO ES VOCAL DEDUCIMOS QUE ES CONSONANTE
        return (i >= 'a' && i <= 'z') && !vocal(i);
    }
}
