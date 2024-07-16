import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*Investigación 1: ArrayList
        Investigar que es un arraylists y hacer ejemplos con los tipos de datos
        que se han visto hasta el momento, también mirar los métodos que
        tienen y hacer ejemplos.*/

        /*Un ArrayList en Java es una estructura de datos dinámica que implementa la interfaz List del marco de colecciones de Java. Esto significa que un ArrayList puede crecer y decrecer en tamaño automáticamente según se añadan o eliminen elementos.

        Características principales de un ArrayList
        Dinámico: Crece y decrece automáticamente.
        Indexado: Acceso a elementos por índice, similar a los arrays tradicionales.
        Permite duplicados: Se pueden almacenar elementos duplicados.
                Permite null: Se pueden almacenar valores null.
                Ejemplo avanzado de uso de ArrayList con tipos de datos primitivos
        En Java, no se pueden almacenar directamente tipos de datos primitivos en un ArrayList. Para ello, se utilizan sus correspondientes clases envolventes (Wrapper classes). Vamos a ver ejemplos avanzados usando Integer, Double, Character y Boolean con operaciones más complejas.

        Integer para int:
        Double para double:
        Character para char:
        Boolean para boolean:*/


            // Ejemplo avanzado con Integer (para int)
            ArrayList<Integer> listaEnteros = new ArrayList<>();
            Collections.addAll(listaEnteros, 10, 20, 30, 40, 50);
            System.out.println("ArrayList de Enteros: " + listaEnteros);
            // Sumar todos los elementos de la lista
            int suma = 0;
            for (int num : listaEnteros) {
                suma += num;
            }
            System.out.println("Suma de elementos: " + suma);

            // Ejemplo avanzado con Double (para double)
            ArrayList<Double> listaDoubles = new ArrayList<>();
            Collections.addAll(listaDoubles, 10.5, 20.75, 30.1, 40.8, 50.3);
            System.out.println("ArrayList de Doubles: " + listaDoubles);
            // Calcular el promedio de los elementos de la lista
            double sumaD = 0;
            for (double num : listaDoubles) {
                sumaD += num;
            }
            double promedio = sumaD / listaDoubles.size();
            System.out.println("Promedio de elementos: " + promedio);

            // Ejemplo avanzado con Character (para char)
            ArrayList<Character> listaCaracteres = new ArrayList<>();
            Collections.addAll(listaCaracteres, 'A', 'B', 'C', 'D', 'E');
            System.out.println("ArrayList de Caracteres: " + listaCaracteres);
            // Concatenar todos los caracteres en una cadena
            StringBuilder sb = new StringBuilder();
            for (char ch : listaCaracteres) {
                sb.append(ch);
            }
            System.out.println("Cadena concatenada: " + sb.toString());

            // Ejemplo avanzado con Boolean (para boolean)
            ArrayList<Boolean> listaBooleanos = new ArrayList<>();
            Collections.addAll(listaBooleanos, true, false, true, true, false);
            System.out.println("ArrayList de Booleanos: " + listaBooleanos);
            // Contar el número de valores true en la lista
            int countTrue = 0;
            for (boolean bool : listaBooleanos) {
                if (bool) countTrue++;
            }
            System.out.println("Número de valores true: " + countTrue);

            /*Métodos comunes de ArrayList y ejemplos de uso avanzado
add(E e): Añade un elemento al final de la lista.
add(int index, E element): Inserta un elemento en una posición específica de la lista.
get(int index): Retorna el elemento en la posición especificada.
set(int index, E element): Reemplaza el elemento en la posición especificada con el elemento proporcionado.
remove(int index): Elimina el elemento en la posición especificada.
size(): Retorna el número de elementos en la lista.
clear(): Elimina todos los elementos de la lista.
contains(Object o): Retorna true si la lista contiene el elemento especificado.
isEmpty(): Retorna true si la lista está vacía.*/


        /*Investigación 2: Map
        Investigar que es un maps y hacer ejemplos con los tipos de datos que
        se han visto hasta el momento, también mirar los métodos que tienen
        y hacer ejemplos.


        Un Map en Java es una colección que mapea claves a valores. A diferencia de las listas o conjuntos, un Map no puede contener claves duplicadas, y cada clave puede asociarse a un valor como máximo. Java proporciona varias implementaciones de la interfaz Map, como HashMap, TreeMap, y LinkedHashMap, cada una con sus propias características y ventajas.

Características principales de un Map
Asociación clave-valor: Permite almacenar pares de claves y valores.
Unicidad de claves: No permite claves duplicadas.
Acceso rápido: Permite acceso rápido a los valores mediante sus claves.
Ejemplo de uso de Map con tipos de datos primitivos
En Java, se utilizan las clases envolventes (Wrapper classes) para almacenar tipos de datos primitivos en un Map. Aquí hay algunos ejemplos usando Integer, Double, Character y Boolean.

Integer para int:
Double para double:
Character para char:
Boolean para boolean:*/

        Map<Integer, String> mapEnteros = new HashMap<>();
        mapEnteros.put(1, "Uno");
        mapEnteros.put(2, "Dos");
        mapEnteros.put(3, "Tres");
        System.out.println("Map de Enteros: " + mapEnteros);

        // Ejemplo con Double (para double)
        Map<Double, String> mapDoubles = new HashMap<>();
        mapDoubles.put(1.1, "Uno punto uno");
        mapDoubles.put(2.2, "Dos punto dos");
        mapDoubles.put(3.3, "Tres punto tres");
        System.out.println("Map de Doubles: " + mapDoubles);

        // Ejemplo con Character (para char)
        Map<Character, String> mapCaracteres = new HashMap<>();
        mapCaracteres.put('A', "Letra A");
        mapCaracteres.put('B', "Letra B");
        mapCaracteres.put('C', "Letra C");
        System.out.println("Map de Caracteres: " + mapCaracteres);

        // Ejemplo con Boolean (para boolean)
        Map<Boolean, String> mapBooleanos = new HashMap<>();
        mapBooleanos.put(true, "Verdadero");
        mapBooleanos.put(false, "Falso");
        System.out.println("Map de Booleanos: " + mapBooleanos);

        /*Métodos comunes de Map y ejemplos de uso
put(K key, V value): Inserta un par clave-valor en el mapa.
get(Object key): Retorna el valor al que está asociada la clave especificada.
remove(Object key): Elimina el mapeo para una clave específica.
containsKey(Object key): Retorna true si el mapa contiene una clave especificada.
containsValue(Object value): Retorna true si el mapa contiene un valor especificado.
keySet(): Retorna un conjunto de todas las claves en el mapa.
values(): Retorna una colección de todos los valores en el mapa.
entrySet(): Retorna un conjunto de todos los mapeos clave-valor en el mapa.
size(): Retorna el número de mapeos clave-valor en el mapa.
clear(): Elimina todos los mapeos del mapa.*/

        /*Investigación 3: OOP
        Investigar sobre los pilares de paradigma orientado a objetos. (Idea)

        El paradigma de la Programación Orientada a Objetos (OOP) es una metodología de programación que se basa en el concepto de "objetos", que pueden contener datos y código: datos en forma de campos (a menudo conocidos como atributos o propiedades), y código en forma de procedimientos (a menudo conocidos como métodos). OOP tiene cuatro pilares fundamentales:

Abstracción
Encapsulamiento
Herencia
Polimorfismo*/
    }
}