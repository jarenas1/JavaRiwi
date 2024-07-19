package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {

        //Alumno alum = new Alumno(); VA A DAR UN ERROR YA QUE ESTE CONSTRUCTOR ESTA PRIVADO

        //ESTE CONSTRUCTOR SI SE PUEDE USAR YA QUE ES PUBLICO
        Alumno alumno1 = new Alumno("Arenas", 01, "Juan");

        alumno1.apellido = "Gaviria";  //COMO ESTE ATRIBUTO ESTA PUBLICO PUEDE SER USADO SIN TENER QUE LLAMAR AL GETTER DE APELLIDO

        //alumno1.nombre = "Jose"; //ESTE VA A DAR UN ERROR DEBIDO A QUE ESTA VARIABLE ESTA PRIVADA, PARA MODIFICAR ESTA LLAMAMOS AL SETTER

        alumno1.setNombre("jose"); //AHORA SI VA A FUNCIONAR
    }
}
