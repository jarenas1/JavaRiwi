package dos;

public class Empleado extends Persona{

    private String id;
    private double salary;

    public Empleado() {
    }

    public Empleado(int age, String name, String id, double salary) {
        super(age, name);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Vamos a llamar al metodo de persona y lo vamos a modificar para que añada las caracteristicas de persona y las de empleado
    @Override
    public String toString() {
        return  super.toString() + ", ID Empleado: " + id + ", Salario: " + salary;
    }
}
