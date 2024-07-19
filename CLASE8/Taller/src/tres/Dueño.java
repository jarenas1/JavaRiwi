package tres;

public class Dueño {

    String name;
    String cc;
    String type;

    public Dueño(String cc, String name, String type) {
        this.cc = cc;
        this.name = name;
        this.type = type;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
