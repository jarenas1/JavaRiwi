package constantes;

public class Person {
    private String name;
    private String email;
    /*private*/ static final int id = 1;
    private gender gender;

    public Person() {
//        ++id;  //SE COMENTO YA QUE SE PUSO EL ATRIBUTO COMO UNA CONSTANTE
    }

    public Person(String email, String name) {
        this();
        this.email = email;
        this.name = name;
    }

    public Person(String email, constantes.gender gender, String name) {
        this(email, name);
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public static int getId() {
        return id;
    }*/

    /*public static void setId(int id) { //Como es autoincremental no lo estamos usando pa nada
        Person.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public constantes.gender getSexo() {
        return gender;
    }
}
