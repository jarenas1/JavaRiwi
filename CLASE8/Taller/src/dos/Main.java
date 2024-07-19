package dos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Creamos un empleado

        Empleado employed = new Empleado(01, "Juan", "FULLSTACK DEV", 10000.00);

        System.out.println("Ingrese el porcentaje que desea aumentarle al empleado");
        Scanner sc = new Scanner(System.in);
        double porcentaje = sc.nextDouble();
        sc.nextLine();

        //modificamos el salario
        employed.salaryIncrement(porcentaje);

        //verificamos incremento
        System.out.println( employed.getSalary());

    }
}
