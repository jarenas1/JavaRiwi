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

//EJEMPLO, TENEMOS LA CLASE MADRE DE VEHICULOS Y LAS CLASES HIJAS QUE SON MOTOS, CARROS Y BUSES


//PODEMOS VER UN EJEMPLO DE POLIMOSFIRMO YA QUE SI CREAMOS UN BUS, UNA MOTO O UN CARRO, ESTOS VAN A SEGUIR SIENDO VEHICULOS

//SE CREAN ASI:

//Vehiculo carro = new Moto();
//Vehiculo carro = new Carro();
//Vehiculo carro = new Bus();

//ESTO NOS VA A PERMITIR CREAR ARRAYS DE TIPO VEHICULO Y EN ESTE GUARDAR MOTOS, CARROS Y BUSES.


//TAMBIEN, SI CREAMOS UN METODO QUE MUESTRE DATOS EN VEHICULO, COMO RUEDAS, CILINDRAJE, PESO.   EN CADA CLASE HIJA LO PODEMOS MODIFICAR
//CON EL OVERRIDE, AÑADIENDO LAS COSAS QUE SE DESEAN MOSTRAR A PARTE DE LO QUE YA ESTA
