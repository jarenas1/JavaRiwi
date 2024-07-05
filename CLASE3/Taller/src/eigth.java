import java.util.Scanner;

public class eigth {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las calificaciones");
        System.out.println("Primera materia");
        double n1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Segunda materia");
        double n2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Tercer materia");
        double n3 = scanner.nextDouble();
        scanner.nextLine();

        double prom = ((n1+n2+n3)/3);

        if (prom >= 6){
            System.out.println("El alumno aprobo con un promedio de "+prom);
        }else {
            System.out.println("El alumno reprobo con una nota de "+prom);
        }
    }
}
