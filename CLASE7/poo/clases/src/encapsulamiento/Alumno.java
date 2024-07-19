package encapsulamiento;

public class Alumno {

    //LOS ATRIBUTOS POR DEFECTO VIENEN PUBLICOS, PERO SE DEBEN PONER PRIVADOS PARA QUE NO SE PUEDA ACCEDER A ESTOS DESDE OTRAS CLASES Y SE DEBAN USAR LOS SETTERS Y GETTERS
    private int id;
    private String nombre;

    //dejamos esta publica para un ejemplo
    String apellido;


    //ponemos privado para el ejemplo

    private Alumno() {
    }
    //PODEMOS ACCEDER A ESTE CONSTRUCTOR DESDE CUALQUIER CLASE YA QUE ESTA PUBLICO
    public Alumno(String apellido, int id, String nombre) {
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
