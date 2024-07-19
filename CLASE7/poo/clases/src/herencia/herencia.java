package herencia;

public class herencia {
    public static void main(String[] args) {
        //CREAMOS UN OBJETO EMPLEADO VACIO CON EL CONSTRUCTOR VACIO

        empleado empleado1 = new empleado();

        empleado1.getNombre(); //ACA PODEMOS VER LO DE LOS GETTERS, PODEMOS VER QUE A PESAR DE QUE NO ESTAN CREADOS EN LA MISMA CLASE, LOS PODEMOS USAR YA QUE SE HEREDARON

        empleado1.setNombre("Guille");

        consultor consultor1 = new consultor();

        consultor1.getApellido();
        
        empleado empleadoGay = new empleado();


    }
}
