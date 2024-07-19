import java.util.ArrayList;
import java.util.List;

public class Alumno { //Se creo la clase, esta se crea publica pero puede ser diferente

    //AÑADIMOS LAS CARACTERISTICAS QUE DEBE TENER EL ESTUDIANTE

    int id;
    String nombre;
    String apellido;
    private List<String> Materias;


    //ESTO QUE CREAMOS FUERON LAS PRINCIPALES CARACTERISTICAS DEL ALUMNO Y LAS TRAJIMOS DEL MUNDO REAL


    //CREACION CONSTRUCTOR


    //en este caso creamos un constructor vacio, nos servira mas tarde
     public Alumno() {
         this.Materias = new ArrayList<>();
    }

    public Alumno(int id, String nombre) {
        this();
        this.id = id;
        this.nombre = nombre;
    }

    //Constructor con atributos, este se crea sin problemas ya que a pesar de que ya se creo uno con este nombre, este tiene atributos y el otro no

    public Alumno(int id, String nombre, String apellido){

        /*LO QUE ESTAMOS HACIENDO CON ESE THIS ES ASIGNARLE LOS VALORES
        * QUE ENTRAN COMO PARAMETROS A LAS VARIABLES(CARACTERISTICAS)
        * CREADAS EN LA CLASE, CON EL FIN DE QUE CADA ALUNNO TENGA SU
        * VARIABLE NOMBRE, APELIIDO Y ID, CON LOS VALORES QUE SE INTRODUZCAN AL
        * LLAMAR AL CONSTRUCTOR
        *
        * this.id se refiere al id que se creo en la clase, y id solo, se refiere al parametro que
        * esta entrando, por ende la variable id de la clase tomara el valor de el parametro */

        this(id, nombre);
        this.apellido = apellido;


        //VAMOS A CREAR UN NUEVO ALUMNO POR MEDIO DE ESTE CONSTRUCTOR EN LA CLASE LLAMADA CREACION
    }


    //---------------------------------------------------------------------------------------------------------------------------------------

    //GETTERS(TRAER) Y SETTERS(COLOCAR), van luego del constructor y antes de los metodos

    //Con get traemos datos para hacer operaciones, con set ponemos datos a cada uno de los atributos, esto sirve para los constructores vacions o modificar datos del objeto


    //GETTERS

    //Este pone el return del dato que vamos a llamar para que nos lo devuelva
    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getMaterias() {
        return Materias;
    }
    //SETTERS

    //Este no retorna ningun valor, ya que es de tipo void, lo que hace es que recibe un dato como
    //parametro y se encarga de setear en la variable de la clase este parametro recibido
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------

//CREACION DE METODOS   MODIFICADORDEACCESO TIPODATOQUEDEVUELVE(SI NO DEVUELVE NADA SE PONE VOID) VERBOINF


    //Pedir al alumno el nombre

    public void devolverNombre(){ //dentro los parentesis van los parametros
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }



    //METODO PARA APROBACION DE MATERIAS

    public void saberAprobado(double calificacion){
        if (calificacion>=6){
            System.out.println("aprobe");
        }else{
            System.out.println("reprobe");
        }
    }

    public Alumno addMateria(String materia){
         this.Materias.add(materia);
         return this;
    }
}
