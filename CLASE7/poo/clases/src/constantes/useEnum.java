package constantes;

import constantes.Color;
public class useEnum {
    public static void main(String[] args) {
        //ITERAR

        for (Color c : Color.values()){
            System.out.println(c);
        }

        //name

        Color col = Color.AZUL;

        System.out.println(col.name());//DEVUELVE EN NOMBRE DE LA CONSTANTE(AZUL)
    }
}
