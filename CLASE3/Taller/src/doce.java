import java.util.Scanner;

public class doce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa tu día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        String signo = "";

        switch (mes) {
            case 1:
                if (dia >= 1 && dia <= 19) {
                    signo = "Capricornio";
                } else if (dia >= 20 && dia <= 31) {
                    signo = "Acuario";
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 18) {
                    signo = "Acuario";
                } else if (dia >= 19 && dia <= 28) {
                    signo = "Piscis";
                }
                break;
            case 3:
                if (dia >= 1 && dia <= 20) {
                    signo = "Piscis";
                } else if (dia >= 21 && dia <= 31) {
                    signo = "Aries";
                }
                break;
            case 4:
                if (dia >= 1 && dia <= 19) {
                    signo = "Aries";
                } else if (dia >= 20 && dia <= 30) {
                    signo = "Tauro";
                }
                break;
            case 5:
                if (dia >= 1 && dia <= 20) {
                    signo = "Tauro";
                } else if (dia >= 21 && dia <= 31) {
                    signo = "Géminis";
                }
                break;
            case 6:
                if (dia >= 1 && dia <= 20) {
                    signo = "Géminis";
                } else if (dia >= 21 && dia <= 30) {
                    signo = "Cáncer";
                }
                break;
            case 7:
                if (dia >= 1 && dia <= 22) {
                    signo = "Cáncer";
                } else if (dia >= 23 && dia <= 31) {
                    signo = "Leo";
                }
                break;
            case 8:
                if (dia >= 1 && dia <= 22) {
                    signo = "Leo";
                } else if (dia >= 23 && dia <= 31) {
                    signo = "Virgo";
                }
                break;
            case 9:
                if (dia >= 1 && dia <= 22) {
                    signo = "Virgo";
                } else if (dia >= 23 && dia <= 30) {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia >= 1 && dia <= 22) {
                    signo = "Libra";
                } else if (dia >= 23 && dia <= 31) {
                    signo = "Escorpio";
                }
                break;
            case 11:
                if (dia >= 1 && dia <= 21) {
                    signo = "Escorpio";
                } else if (dia >= 22 && dia <= 30) {
                    signo = "Sagitario";
                }
                break;
            case 12:
                if (dia >= 1 && dia <= 21) {
                    signo = "Sagitario";
                } else if (dia >= 22 && dia <= 31) {
                    signo = "Capricornio";
                }
                break;
            default:
                signo = "Mes invaldo";
        }


            System.out.println("Su signo del zodíaco es: " + signo);


        scanner.close();
    }
}
