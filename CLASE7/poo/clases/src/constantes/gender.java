package constantes;

public enum gender {
    GENDER_MAN("Masculino","vergon"),
    GENDER_WOMAN("Femenino","cucona");

    private final String gender;
    private final String partes;

    gender(String gender, String partes) {
        this.gender = gender;
        this.partes = partes;
    }

    public String getGender() {
        return this.gender;
    }

    public String getPartes() {
        return this.partes;
    }
}
