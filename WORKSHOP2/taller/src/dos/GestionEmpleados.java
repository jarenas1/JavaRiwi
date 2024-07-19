package dos;

import uno.EspProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionEmpleados {
    public static void main(String[] args) {

        List<Empleado> lista = new ArrayList<>();

        add(lista);
        show(lista);
        delete(lista);
        show(lista);

    }

    public static void add(List<Empleado> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para añadir un empleado temportal o 2 para uno permanente");
        int op = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        String name = sc.nextLine();
        System.out.println("Ingrese la edad del empleado");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el id ");
        String id = sc.nextLine();
        System.out.println("Ingrese el salario");
        double salary = sc.nextDouble();
        sc.nextLine();
        String contrato;
        if (op == 1) {
            contrato = "temporal";
        } else {
            contrato = "Permanente";
        }

        if (op == 1) {
            EmpleadoTemporal tempo = new EmpleadoTemporal(age, name, id, salary, contrato);
            lista.add(tempo);
        } else if (op==2) {
            EmpleadoPermanente perma = new EmpleadoPermanente(age, name, id, salary, contrato);
            lista.add(perma);
        }else{
            System.out.println("Ingrese una opcion valida");
        }
    }

    public static void delete(List<Empleado> lista){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el id del empleado que desea eliminar");
        String idToDelete = sc.nextLine();


       for (int i=0;i<lista.size();i++){
           String id = lista.get(i).getId();
           if (idToDelete.equals(id)){
               lista.remove(i);
               return;
           }
       }
    }

    public static void show(List<Empleado> lista){
        if (lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            for (Empleado iterator : lista){
                //Con el metodo toString estamos evidenciando el polimorfismo
                System.out.println(iterator.toString());
            }
        }
    }
}
