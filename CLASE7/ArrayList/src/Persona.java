public class Persona {

    private int num;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int edad, String nombre, int num) {
        this.edad = edad;
        this.nombre = nombre;
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
