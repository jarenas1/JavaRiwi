import java.util.Scanner;

public class quince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var status = "";

        System.out.println("Ingrese la nota de su examen (0-100)");
        int nota = scanner.nextInt();
        scanner.nextLine();

        if (nota > 100) {
            System.out.println("Nota inválida");
        } else if (nota >= 90 && nota <= 100) {
            status = "A";
        } else if (nota <= 89 && nota >= 80) {
            status = "B";
        } else if (nota <= 79 && nota >= 70) {
            status = "C";
        } else if (nota <= 69 && nota >= 60) {
            status = "D";
        } else if (nota <= 59 && nota >= 50) {
            status = "E";
        } else {
            status = "F";
        }

        System.out.println("STATUS: "+status);
    }
}
