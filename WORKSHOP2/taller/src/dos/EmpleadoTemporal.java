package dos;

public class EmpleadoTemporal extends Empleado{

    private String contrato;

    public EmpleadoTemporal() {
    }

    public EmpleadoTemporal(int age, String name, String id, double salary, String contrato) {
        super(age, name, id, salary);
        this.contrato = contrato;
    }
    @Override

    public String toString(){
        return super.toString() + ", Contraro: " + contrato;
    }

}
