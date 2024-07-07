import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class diezynueve {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento (YYYY):");
        int year = scanner.nextInt();

        System.out.println("Ingrese su mes de nacimiento (MM):");
        int month = scanner.nextInt();

        System.out.println("Ingrese su día de nacimiento (DD):");
        int day = scanner.nextInt();

        //UNIMOS TODO ESTO A UN FORMATO DE FECHA USANDO LA CLASE LOCAL DATE
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);

        System.out.println(fechaNacimiento);

        // OBTENEMOS LA FECHA ACTUAL CON EL LOCAL DATE
        LocalDate fechaActual = LocalDate.now();

        // CALCULAMOS LA EDAD CON LA CLASE PERIOD

        //USAMOS EL METODO BETWEEN DE LA CLASE PERIOD, EL CUAL DEVUELVE EL TIEMPO ENTRE 2 FECHAS
        Period años = Period.between(fechaNacimiento, fechaActual);

        //OBTENEMOS CUANTOS AÑOS HAN PASADO DE LA FECHA INICIAL A LA FECHA ACTUAL EN AÑOS EXACTOS
        int edad = años.getYears();

        // DETERMINAMOS SI ES MAYOR DE EDAD
        boolean esMayorDeEdad = edad >= 18;

        // MOSTRAMOS LA EDAD Y SI ES MAYOR O NO
        System.out.println("Usted tiene " + edad + " años.");

        if (esMayorDeEdad) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

    }
}
