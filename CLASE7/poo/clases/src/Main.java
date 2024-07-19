public class Main {
    public static void main(String[] args) {

        //todocode

        //poo se basa en agrupar codigo y todos los datos que tienen un mismo significado o una relacion
        //este codigo se agruparia en lo que conocemos como clases

        //Las clases tiene las siguientes caracteristicas

        //abstraccion/encapsulamiento/polimorfismo/herencia/uml

        //QUE SON LAS CLASES?

        //es una plantilla que nos va a permitir contruir objetos

        //ej, una molde de plastilina, cuando pasamos la plastilina va a adquirir su forma
        /*CUANDO QUERAMOS TRAER ALGO DE LA VIDA REAL AL CODIGO DEBEMOS PLANTEAR COMO
         * VAMOS A FORMARLO, ES DECIR, COMO PODEMOS CREARLE UN MOLDE CON SUS CARACTERISTICAS*/


        //PRACTICA, CLASE ALUMNOS CON LOS SIGUIENTES ATRIBUTOS, NOMBRE,APELLIDO Y ID
        //las clases deben crearse en singular y con la mayuscula inicial

        //---------------------------------------------------------------------------------------------------------------------------------------

        //QUE ES UN METODO??

        //nos ayuda a definir las acciones que los objetos que creamos mediante la clase van a realizar

        //Asi como los atributos nos dicen las caracteristicas los metodos son las cosas que puede hacer


        //ej, un carro tiene sus caracteristicas pero tambien tiene funciones como frenar, acelerar, girar

        //NOTAS: estos metodos los identificamos como verbos en infinitivo(ar,er,ir),  opcionalmente tienen valores de entrada y valores de salida

//---------------------------------------------------------------------------------------------------------------------------------------

        //OBJETOS:

        //Un objeto es una instancia de una clase, esto quiere decir que se crea un objeto con base en una clase
        //ej, pasamos una bola de plastilina y la pasamos por una clase molde, la figura transformada es el objeto

        //para crear estos objetos usamos los METODOS CONSTRUCTORES

        //---------------------------------------------------------------------------------------------------------------------------------------

        //THIS:
        //Nos sirve para llamar las variables de la clase en el constructor y añadirle los valores de los atributos

        //---------------------------------------------------------------------------------------------------------------------------------------

        //GETTER Y SETTERS

        //ESTO NOS SIRVE PARA INVOCAR METODOS A UN OBJETO, ESTOS SIEMPRE VAN CREADOS ANTES DE LOS METODOS QUE HEMOS CREADO Y DESPUES DE LOS CONSTRUCTORES



        //----------------------------------------PILARES DEL POO-------------------------------------------------------

        //HERENCIA:

        /*Hay clases que comparten entre si varias caracteristicas, en si, este concepto significa literalmente lo mismo que en la vida real
        * Esto se da ya que podemos crear clases por medio de clases madres
        *
        * ej: la clase madre persona, puede tener atributos como edad, nombre, apeliido,etc..
        *
        * de esa clase madre vamos a sacar 2 clases hijas llamadas empleado y consultor, estas van a heredar
        * las principales caracteristicas de la clase madre ya que ambas siguen siendo personas */


        //------------------------------------------------------------------------------------------------------------------------

        //POLIMOSFIRMO:

        /*A partir de un objeto que pertenece a una clase madre, otros objetos creados con clases hijas van tener muchos atributos similares
        * y van a parecer que son lo mismo, pero con diferentes caracteristicas
        *
        * EJ: Tenemos una clase MADRE que se llama vehiculos, y de esta se heredan caracteristicas en las clases coche, moto y bus
        *
        * ahora bien , todas estas clases hijas pueden crear vehiculos, pero todos van a tener varias caractetisticas, a esto se le llama polimorfismo,
        * que quiere decir muchas formas de hacer algo, en este caso muchas formas de hacer vehiculos
        *
        * ------------------------------------------------------------------------------------------------------------------
        *
        * Polimorfismo en tiempo de compilación (sobrecarga de métodos): Este tipo no requiere herencia. Ocurre cuando hay más de un método con el mismo nombre pero diferentes parámetros dentro de la misma clase.

        Polimorfismo en tiempo de ejecución (sobreescritura de métodos): Este tipo sí requiere herencia. Ocurre cuando una subclase proporciona una implementació
        *  específica de un método que ya está definido en su superclase.
        *
        * --------------MI EXPLICACION---------------------------------------------------------
        *
        *PODEMOS VER EL PLIMOSFIRMO CUANDO LLAMAMOS METODOS DE UNA CLASE MADRE Y LOS MODIFICAMOS EN LA CLASE HIJA O CUANDO CREAMOS EN UNA CLASE
        *VARIOS METODOS QUE SE LLAMAN IGUAL PERO RECIBEN ATRIBUTOS DISTINTOS, POR LO QUE GENERAN COSAS DIFERENTES*/


        //-----------------------------------------------------------------------------------------------------------------------------

        //ENCAPSULAMIENTO:

        /*Reune elementos que se concideran pertenecientes a una misma entidad al mismo nivel de abstraccion (PERMITE 3 NIVELES DE ACCESO, PUBLIC, PRIVATE Y PROTECTED)
        DEPENDIENDO cual de los 3 utilicemos en nuestros atributos y metidos
        *
        * ESTO ES COMPLTAMENTE DIFERENTE AL PRINCIPIO DE OCULTACION
        *
        * El principio de ocultacion aisla a los elementos y unicamente expone un interfaz de estos a otros objetos, este protege
        * las propiedades de un objeto contra su modificacion por quien no tenga derecho a acceder a estas

        DEPENDIENDO DE CUAL NIVEL DE ABSTRACCION USEMOS EN NUESTROS ATRIBUTOS O METODOS VAMOS A PODER ACCEDER O NO A DETERMINADOS DATOS

        PUBLIC: puede ser utilizado desde cualquier clase

        PRIVATE: unicamente se puede usar dentro de la clase donde está creado

        PROTECTED: el acceso puede ser usado dentro de la misma clase y en sus clases hijas*/



    }
}