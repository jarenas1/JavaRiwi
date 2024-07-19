package dos;

public class Persona {
    private String name;
    private int age;

    public Persona() {
    }

    public Persona(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //mostrar el objeto, este es el que va a experimentar el polimosfirmo
    @Override
    public String toString() {
        return "Nombre: " + name + ", Edad: " + age;
    }
}
