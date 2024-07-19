package dos;

public class Empleado {

    String name;
    String position;
    Double salary;
    int id;

    public Empleado() {
    }

    public Empleado(int id, String name, String position, Double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //increment salary

    public void salaryIncrement(double increment){
        double initial = 100 + increment;

        this.salary = (salary*initial)/100;
    }
}
