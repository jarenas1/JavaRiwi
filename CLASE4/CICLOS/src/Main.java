public class Main {
    public static void main(String[] args) {

        //CICLOS

        //FOR

        //for(contador;condicion;actualizacion){}

        for (int i = 0; i<10;i++){
            System.out.println(i);
        }

        //CONTROL DE FLUJO:  break;  rompe el ciclo y se sale      continue;  se salta todo lo que esta abajo y vuelve a epezar

        //FALTA EJEMPLO------------------------------

        //FOR-EACH    for(tipovar : array que va a iterar)

        String texto = "holaaaa";

        for(char c : texto.toCharArray()){
            System.out.println(c);
        }

        //----------------------------------WHILE--------------------------------------------------

        //SE ACONSEJA USAR CUANDO NO TENEMOS UNA XONDICION ESTABLE PARA FINALIZAR, EJ: UN MENU CON EXIT

        while (true){
            System.out.println("HOLA");

            break;
        }


        //DO WHILE   //PRIMERO SE EJECUTA EL BUCLE Y AL FINAL SE EVALUA LA CONDICION, SI SE CUMMPLE SE VUELVE A EJECTAR
        boolean nn = true;
        do{

            //TODO LO QUE SE VA A EJECUTAR
            System.out.println("Hola");
            nn = false;

        }while (nn==true);


    }
}