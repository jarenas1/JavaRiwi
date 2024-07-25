package constantes;

//INGRESAMOS LOS COLORES EN MAY, YA QUE SON CONSTANTES
//AÑADIMOS NUMEROS PARA VER QUE SE PUEDEN GUARDAR DATOS
public enum Color {
    AMARILLO(1),
    AZUL(2),
    ROJO(3),
    NARANJA(4),
    VERDE(5);

    //TIPO DE DATO
    final int numero;

    Color(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }


}
//EN EL ARCHIVO QUE DESEMOS USAR ESTE ENUM, DEBEMOS IMPORTARLO