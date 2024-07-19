package polimosfirmo;

public class Herencia {

    public static void main(String[] args) {

        //EJEMPLO, TENEMOS UN ARRAY DE TIPO PERSONA, Y QUEREMOS GUARDAR TAMBIEN JEFES, EMPLEADOS, ETC..

        Persona vec [] = new Persona[5]; //Creamos el array de tipo persona

        //PODEMOS VER QUE NO ESTA PERMITIENDO AÑADIR LOS DATOS DE TIPO PERSONA Y LOS QUE SE DESPRENDEN DE ESTE, YA QUE
        //LOS EMPLEADOS, JEFES, ETC.. TAMBIEN SON PERSONAS DEBIDO A SUS ATRIBUTOS. SI TRATAMOS DE AÑADIR, EJ: UN STRING NO VA A DEJAR

        vec[0] = new Persona();
        vec[1] = new Jefe();
        vec[2] =new Persona();
        vec[3] = new Consultor();

    }
}
