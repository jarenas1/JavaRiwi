import java.util.Scanner;

public class diezyseis {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();

        //CREAMOS UN METODO PARA VERIFICAR LA CONTRASEÑA QUE RECIBE CONTRASEÑA Y DEVUELVE VERDADERO O FALSO
        boolean esSegura = validatePassword(contraseña);
        System.out.println("La contraseña es segura: " + esSegura);
    }

    public static boolean validatePassword (String contraseña){
        //VERIFICAMOS PRIMERO EL TAMAÑO
        if (contraseña.length() < 8){
            return false;
        }
        //DECLARAMOS VARIABLES BOOLEANAS QUE LUEGO VAN A CAMBIAR DE ESTADO
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean caracterEspecial = false;


        //VAMOS A PASAR LA CONTRASEÑA A UN ARRAY SEPARADO POR CARACTER Y LO ITERAMOS POR MEDIO DE LA VARIABLE I, QUE VA A TOMAR EL VALOR DE CADA POSICION DEL ARRAY
        for (char i : contraseña.toCharArray()){

            //verificamos si cada posicion del array es mayuscula, si entra por lo menos una vez ya cumple la condicion y asi con todas las otras
            if (Character.isUpperCase(i)){
                mayuscula = true;
                
            } else if (Character.isLowerCase(i)) {
                minuscula = true;
            } else if (!Character.isLetterOrDigit(i)) {
                caracterEspecial = true;
            }
            //VERIFICAMOS SI CUMPLE TODA LAS CONDICIONES Y SI SI, VA A DEVOLVER TRUE, SI NO DEVUELVE FALSE
            if (mayuscula && minuscula && caracterEspecial) {
                return true;
            }
        }
        return false;
    }

}
