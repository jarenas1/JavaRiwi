package polimosfirmo;

public class Jefe extends Persona{

    int idJede;
    String deptoJefe;

    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String deptoJefe, int idJede) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.deptoJefe = deptoJefe;
        this.idJede = idJede;
    }

    public Jefe(){

    }

    public String getDeptoJefe() {
        return deptoJefe;
    }

    public void setDeptoJefe(String deptoJefe) {
        this.deptoJefe = deptoJefe;
    }

    public int getIdJede() {
        return idJede;
    }

    public void setIdJede(int idJede) {
        this.idJede = idJede;
    }
}
