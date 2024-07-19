package dos;

public class EmpleadoPermanente extends Empleado{

    private String contrato;

    public EmpleadoPermanente() {
    }

    public EmpleadoPermanente(int age, String name, String id, double salary, String contrato) {
        super(age, name, id, salary);
        this.contrato = contrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override

    public String toString(){
        return super.toString() + ", Contraro: " + contrato;
    }
}
