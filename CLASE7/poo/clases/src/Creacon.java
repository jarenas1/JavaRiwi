public class Creacon {
    public static void main(String[] args) {

        //PARA CREAR UN OBJETO LO HACEMOS IGUAL QUE CON EL SCANNER,  Constructor nombre = new Constructor();


        //le pasamos los parametros que va a tenere, en ete caso nombre, apellido y id
        //los parametros se deben pasar en el mismo orden en el que fueron declarados
        Alumno alumno1 = new Alumno(01, "Juan", "Arenas");
        alumno1.addMateria("Matemáticas")
                .addMateria("Inglés");
        System.out.println(alumno1.getMaterias());

        //si no le paramos los parametros va a crear un alumno vacio con el constructor vacio creado anteriormente
        Alumno alumno2 = new Alumno();

        //VAMOS A USAR EL GETTER Y EL SETTER

        //1. traer el id del alumno1, ponemos el objeto. y ahi tenemos acceso a todos los metodos pubblicos
        System.out.println("el nombre del alumno 1 es: "+ alumno1.getNombre());

        //2. poner un nombre al alumno2

        alumno2.setNombre("pablo");

        System.out.println(alumno2.getNombre());


        //recordemos que el set tambien nos sirve para modificar datos

        alumno1.setNombre("Juan Jose");
        System.out.println(alumno1.getMaterias());

        System.out.println(alumno1.getNombre());
    }
}
