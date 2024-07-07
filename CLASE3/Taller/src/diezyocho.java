import java.util.Random;
import java.util.Scanner;

public class diezyocho {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //IMPORTAMOS A RANDOM PARA ESCOGER UNA OPCION DE LA MAQUINA
        Random random = new Random();

        //PEDIMOS UNA OPCION AL USUARIO Y LA GUARDAMOS EN MINUSCULA
        System.out.println("Elige: Piedra, Papel o Tijera");
        String user = scanner.nextLine().toLowerCase();

        //CREAMOS UN ARRAY CON LAS OPCIONES DE LA MAQUINA
        String[] opciones = {"piedra", "papel", "tijera"};

        //CREAMOS UN STRING QUE VA A SER LA OPCION DEL BOT,  ENTONCES LE DECIMOS QUE DEL ARRAY OPCIONES ESCOJA UN NUMERO ENTERO RANDOM HASTA EL TAMAÑO DEL ARRAY
        String bot = opciones[random.nextInt(opciones.length)];
        //ESA ES LA RAZON POR LA CUAL ESTA DENTRO DE CORCHETES, PORQUE random.nextInt(opciones.length) DEVUELVE UN NUMERO ENTRE 0 Y EL TAMAÑO DEL ARRAY
        //UNA VEZ DEVUELVE EL NUMERO HACE ESTO ARRAY[NUMERO ALEATORIO]

        System.out.println("La computadora eligió: " + bot);

        //HACEMOS LAS VERIFICACIONES PARA MOSTRAR MENSAJES (SE USA EQUALS EN VEZ DE == YA QUE STRING NO ES PRIMITIVO)
        if (user.equals(bot)) {
            System.out.println("¡Es un empate!");
        } else if (ganador(bot,user)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste. ¡Intenta de nuevo!");
        }
    }

    //CREAMOS LA METODO GANADOR QUE VERIFICA LAS POSIBLES OPCIONES EN LAS QUE EL USUARIO GANE, Y SI SE CUMPLE ALGUNA DEVUELVE TRUE
    public static boolean ganador(String bot, String user){
        return (user.equals("piedra") && bot.equals("tijera")) || (user.equals("papel") && bot.equals("pierdra")) || (user.equals("tijera") && bot.equals("papel"));
    }
}
