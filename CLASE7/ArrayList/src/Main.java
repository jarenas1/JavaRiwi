import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        //EN JAVA EXISTEN DIFERENTES LISTAS(ArrayList, LinkedList, Stack)

        //ARRAYLIST:

        /*permite coleccion y elementos duplicados
        *
        *El orden de los registros es el orden en el que se ingresaron
        *
        * tienen un indice */

        //CREACION DEL ARRAYLIST list<typeofdata> name = new ArrayList<typeofdata>();   DEBEMOS IMPORTAR LA LISTA import java.util.List; y el arraylist import java.util.ArrayList;

        List<Persona>lista = new ArrayList<>();

        //ESTA LISTA TIENE METODOS PARA MODIFICARLA

        //AÑADIR .add

        lista.add(new Persona(18,"Juan",1)); //Añadimos y creamos una persona al tiempo
        lista.add(new Persona(18,"Mateo",2));
        lista.add(new Persona(18,"Karen",3));
        lista.add(new Persona(18,"Andres",4));

        //TAMBIEN PODEMOS AÑADIR EN UNA POSICION ESPECIFICA, AÑADIENDO EL INDICE ASI .add(indice, dato)

        //RECORRERLA (for-each o for)  se recorre igual que un vector (EN VEZ DE .LENGTH(), USAMOS .SIZE())

        for (int i = 0; i<lista.size();i++){
            System.out.println(lista.get(i)); //para trar algo usamos el .get(posicion)

            //ESTO NOS VA A DEVOLVER EL OBJETO COMO TAL, PARA VER UNA PROPIEDAD EN ESPECIFICO, LE UNIMOS UN GETTER O UN SETTER
            System.out.println(lista.get(i).getNombre());
        }

        //CON EL FOR-EACH
        for (Persona person : lista){
            System.out.println(person.getEdad());
        }

        //metodos del arraylist

        //set(index,value)   REEMPLAZA EL ELEMENTO EN LA POSICION QUE DEMOS POR EL ELEMENTO QUE METEMOS, CUIDADO CON REEMPLAZA

        //remove(index)  ELIMINA EL ELEMENTO DE LA POSICION ESPECIFICA

        //remove(elemento)  ELIMINA EL PRIMER ELEMENTO QUE COINCIDA CON EL QUE INGRESAMOS

        //size() IGUAL AL .LENGTH()

        //clear() ELIMINA TODOS LOS ELEMENTOS DE LA LISTA

        //isEmpty() DEVUELVE true SI LA LISTA NO CONTIENE ELEMENTOS

        //contains(elemento) DEVUELVE TRUE SI ENCUENTRA EL ELEMENTO INGRESADO

        //index0f(elemento) DEVUELVE LA (PRIMERAAAA) POSICION EN LA QUE ESTA EL ELEMENTO

        //lastIndexOf(elemento) DEVUELVE LA ULTIMA POSICION DEL ELEMENTO




    }
}