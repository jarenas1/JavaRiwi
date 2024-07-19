package uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        List<EspProduct> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean estado = true;

        while (estado) {
            System.out.println("Ingrese una opción:  1. listar   2. añadir   3. buscar  4. eliminar  5. salir");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> show(lista);
                case 2 -> add(lista);
                case 3 -> find(lista);
                case 4 -> delete(lista);
                case 5 -> estado = false;
                default -> System.out.println("Ingrese una opción correcta");
            }
        }
    }

    //ELIMINAR

    public static void delete(List<EspProduct> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a eliminar");
        String product = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < lista.size(); i++) {
            EspProduct toDelete = lista.get(i);
            if (toDelete.getName().equals(product)) {
                lista.remove(i);
                System.out.println("Producto eliminado exitosamente");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no existe");
        }
    }

    //AÑADIR
    public static void add(List<EspProduct> lista) {
        Scanner scanner = new Scanner(System.in);

        // PEDIMOS DATOS DEL PRODUCTO
        System.out.println("Ingrese el id del producto");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre");
        String name = scanner.nextLine();

        System.out.println("Ingrese el precio del producto");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la marca del producto");
        String brand = scanner.nextLine();

        System.out.println("Ingrese la categoría");
        String category = scanner.nextLine();

        // VERIFICAR SI EL PRODUCTO YA EXISTE
        boolean encontrado = false;
        for (EspProduct iterator : lista) {
            if (iterator.getName().equals(name) && iterator.getBrand().equals(brand)) {
                System.out.println("El producto ya está en el inventario");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            EspProduct product = new EspProduct(id, name, price, brand, category);
            lista.add(product);
            System.out.println("Producto añadido");
        }
    }

    //LISTAR PRODUCTOS

    public static void show(List<EspProduct> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay productos en el inventario");
        } else {
            for (EspProduct iterator : lista) {
                System.out.println("Nombre: " + iterator.getName() + " Precio: " + iterator.getPrice() + " Marca: " + iterator.getBrand() + " Categoría: " + iterator.getCategory());
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    //BUSCAR UN PRODUCTO POR EL NOMBRE
    public static void find(List<EspProduct> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea buscar");
        String producto = scanner.nextLine();
        boolean encontrado = false;

        for (EspProduct iterator : lista) {
            if (iterator.getName().equals(producto)) {
                System.out.println("Producto encontrado:");
                System.out.println("Nombre: " + iterator.getName());
                System.out.println("Precio: " + iterator.getPrice());
                System.out.println("Marca: " + iterator.getBrand());
                System.out.println("Categoría: " + iterator.getCategory());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no existe");
        }
    }
}

