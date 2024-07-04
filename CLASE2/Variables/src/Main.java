import java.util.Scanner; //IMPORTAMOS EL SCANNER PARA PODER RECIBIR DATOS

public class Main {
    public static void main (String[] args){
        System.out.println("hola");

        //DECLARAR VARIABLES

        byte isByte = 100; // ENTERO 8 BYTES
        short isShort = 1000; //ENTERO 16 BYTES
        int isInt = 20000;
        long isLong = 35000000;
        float isFloat = 12.3500f;
        double isDouble = 12.13;
        char isChar = 'A'; //VA CON COMILLAS SIMPLES
        boolean isBoolean = true;

        System.out.println(isByte);

        //SUMA ENTEROS
        long suma = isByte + isShort + isInt + isLong;   //DEBEMOS DECLARAR LA SUMA COMO EL NUMERO MAS GRANDE QUE VAMOS A SUMAR

        //SUMA FLOAT

        double suma2 = isDouble + isFloat;

        //ENTEROS Y FLOTANTES SUMA

        double suma3 = isFloat + isInt;
//-------------------------------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int userInput = scanner.nextInt(); //PEDIMOS AL USUARIO UN INT POR CONSOLA (INT SOLAMENTE)

        scanner.nextLine(); //SE DEBEN SEPARAR LOS SCANNERS CON ESTE PARA QUE LOS LIMPIE Y PUEDA RECIBIR OTRO DATO

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine(); //RECIBE UNICAMENTE STRINGS DEL USUARIO

        //System.out.println("Su nombre es "+ nombre+" Y su edad es "+ userInput);

        scanner.close(); //CERRAMOS SCANNER POR BUENAS PRACTICAS

//-----------------------------------ESTRUCTURAS DE CONTROL----------------------------------

        if (userInput < 18){
            System.out.println("Hola! "+nombre +" Usted es menor de edad");
        } else if (userInput == 21) {
            System.out.println("eloy gei");
        }else {
            System.out.println("Hola! "+nombre+" Usted es mayor de edad");
        }

        //----------------------------SWITCH------------------------


    }
}
