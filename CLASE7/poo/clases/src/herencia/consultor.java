package herencia;
//VAMOS A HEREDAR DE LA CLASE PERSONA ponemos luego de la clase: extenda NombreClaseMadre
public class consultor extends Persona {

    //CREAMOS VARIABLES PROPIAS

    String nombreConsultora;
    int numConsultor;

    //CREAMOS CONSTRUCTORES

    public consultor(){

    }

    public consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombreConsultora, int numConsultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultor = numConsultor;
    }

    //CREAMOS GET Y SET

    // Getter y Setter para nombreConsultora
    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    // Getter y Setter para numConsultor
    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
}
