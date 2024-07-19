package herencia;
//VAMOS A HEREDAR DE LA CLASE PERSONA ponemos luego de la clase: extenda NombreClaseMadre
public class empleado extends Persona {

    //AHORA CREAMOS LAS VARIABLES PROPIAS DEL EMPLEADO

    int numLegarjo;
    String cargo;
    String sueldo;

    //CREAMOS CONSTRUCTORES:  aca con el atajo nos va a dejar utlizar los atributos heredados

    public empleado(){

    }

    //CREAMOS EL CONSTRUCTOR CON LAS VARIABLES DE LA MADRE Y DE ESTA

    public empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int numLegarjo, String cargo, String sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono); //super recibe los datos y los envia a la clase madre para decirle cuales debe asignar

        //Con las variables creadas en la clase hija, si debemos hacer la asignacion con el this
        this.numLegarjo = numLegarjo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //A LA HORA DE CREAR LOS SETTERS Y GETTERS, SOLO DEBEMOS CREAR LOS DE LAS VARIABLES LOCALES, YA QUE LOS METODOS DE LAS VARIABLES HEREDADAS TAMBIEN SE HEREDAN

    // Getter y Setter para numLegajo
    public int getNumLegajo() {
        return numLegarjo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegarjo = numLegajo;
    }

    // Getter y Setter para cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter y Setter para sueldo
    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

}
