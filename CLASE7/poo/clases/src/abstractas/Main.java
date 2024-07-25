package abstractas;

public class Main {
    public static void main(String[] args) {

        //LAS CLASES ABSTRACTAS NO PUEDEN SER INSTANCIADAS, YA QUE ESTAS SE CREAN CON EL OBJETIVO DE CREAR CLASES HIJAS A PARTIR DE ESTA MEDIANTE LA HERENCIA

        /*ESTAS PUEDEN CONTENER METODOS, PERO AL MENOS UNO DEBE SER ABSTRACTO, UN METODO ES ABSTRACTO CUANDO LO DEFINIMOS PERO DECIMOS COMO FUNCIONA
        *
        * UNA CLASE NO PUEDE HEREDAR DE VARIAS CLASES (NO PUEDE TENER 2 PADRES)
        *
        *EJEMPLO:
        *
        * TENEMOS LA CLASE FIGURA, CON POSICION X, Y, ESTA TIENE UN METODO VACIO LLAMADO CALCULAR AREA
        *
        * ESTA CLASE TIENE 2 HIJAS, CIRCULO, EL CUAL A PARTE DE LA POSICION RECIBE EL RADIO Y CUADRADO QUE A PARTE DE LA POSICION RECIBE UN LADO
        *
        * ESTAS 2 TIENEN LA IMPLEMENTACION DEL METODO CALCULAR AREA MODIFICADO A SU MANERA
        *
        *
        * AL MOMENTO DE CREAR UNA CLASE ABSTRACTA DEBEMOS, AÑADIR LA PALABRA ABSTRACT ENTRE LAS PALABRAS RESERVADAS PUBLIC Y CLASS EN LA PARTE SUPERIOR
        * TAMBIEN, AL MOMENTO DE CREAR LA CLASE ABSTRACTA DEBEMOS PONERLE EL ABSTRACT Y TERMINARLA EN LOS (), NO USAR LLAVES
        *
        * TENER EN CUENTA QUE LAS CLASES ABSTRACTAS TAMBIEN PUEDEN TENER CONSTRUCTORES Y QUE EL METODO O LOS METODOS ABSTRACTOS CREADOS
        * DEBEN SI O SI SER USADOS EN LAS HIJAS USANDO EL OVERRIDE*/
    }
}
