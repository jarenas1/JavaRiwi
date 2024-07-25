package constantes;


//import static constantes.Person.getId;

public class Main {
    //UNA CONSTANTE ES ALGO QUE NUNCA CAMBIAN
    //LO QUE INDICA QUE ESTAMOS CREANDO UNA CONSTANTE ES LA PALABRA "final"

    //private/public/protected final typoDato nombre;    DEBEMOS LLENARLO CON UN CONSTRUCTOR USANDO EL THIS

    //TENER EN CUENTA QUE ESTO NO NOS PERMITE USAR SETTERS




    //ESTATICOS

    //ATRIBUTOS

    //se pone la palabra static luego del modificador de encapsulamiento

    //LO QUE HACE ESTO ES QUE LOS ATRBITUOS DEJEN DE SER DE CADA OBJETO Y PASEN A SER DE LA CLASE COMO TAL

    //SI CREAMOS UN 2 OBJETOS Y TENEMOS LA VARIABLE FRASE LA CUAL DICE "HOLA", AL MOMENTO DE LLAMAR LA FRASE DE LOS OBJETOS NOS VA A DAR HOLA,
    //PERO SI EN UNO DE LOS 2 OBJETOS LA CAMBIAMOS YA LOS 2 OBJETOS TENDRAN FRASES DIFERENTES.

    //PERO SI USAMOS STATIC YA LA VARIABLE VA A SER DE LA CLASE, POR ENDE SI SE MODIFICA EN ALGUN PUNTO SE VA A MODIFICAR PARA TODOS LOS OBJETOS


    //POR ENDE SI DESEAMOS LLAMAR ESTA NO TENEOS QUE CREAR UN OBJETO PARA HACER ESTO: OBJETO.FRASE  SI NO QUE SE PUEDE LLAMAR DIRECTAMENTE CON LA CLASE ASI: CLASE.FRASE


    //METODOS

    /*PODEMOS TAMBIEN CREAR METODOS ESTATICOS, LOS CUALES VAN A TENER LAS MISMAS CARACTERISTICAS QUE LOS ATRIBUTOS,
    *
    * VAN A SER DE LA CLASE, Y VAN A PERMITIR LLAMARSEN DESDE LA CLASE */




    //----------------------ENUMS--------------------------------------

    /*Es una palabra que se usa para crear un tipo de dato, el cual representa un conjunto FIJO de CONSTANTES
    *
    * DECLARACION: enum name{VALUES, VALUES, VALUES}
    *
    * ESTOS SE CREAN DENTRO DE UNA CLASE

    * enum NombreDelEnum{ROJO,AZUL,NEGRO,BLANCO}
    *
    * PARA ACCEDER A UN VALOR:  NombreEnum.CONSTANTE, y trae la constnte
    *
    * OTRA FUNCIONALIDAD MUY UTIL ES QUE ESTOS ENUMS FUNCIONAN COMO ARRAYS, POR LO QUE PODEMOS ACCEDER A LOS VALORES POR MEDIO DE FOR EACH CON EL .VALUES
    *
    *
     */

    enum Colo {ROJO,AZUL,AMARILLO}

    public static void main(String[] args) {
        for (Colo c:Colo.values()){
            System.out.println(c);
        }
    }

    //METODOS DEL ENUM:

    //name(), devuelve un string con el nombre de la constante
    //ordinal(), devuelve un entero con las posicion del enum
    //values(), devuelve un array que contiene todos los elementos del enum
    //valuesOf(name), se usa para obtener la constante ingresada en un enum

    //TAMBIEN PODEMOS CREAR UN ENUM COMO SI FUERA UNA CLASE

    //LO ENUMS TAMBIEN PUEDEN TENER DATOS GUARDADOS ADENTRO DE SI MISMOS, SE METEN CREANDO EL ENUM Y DENTRO DEL PARENTESIS, SEPARADOS POR , LOS VALORES QUE VA A ALAMCENAR

    //CUANDO UN ENUM GUARDA DATOS SE DEBEN DE CREAR UN CONSTRUCTO, GETTER Y SETTER


}
