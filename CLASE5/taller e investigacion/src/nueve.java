import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class nueve {
    public static void main(String[] args) {
        String Frase = "antony me va a poner cinco porque antony es un bien y antony antony carros carros casa casa casa dios";
        String[] fraseArray = Frase.toLowerCase().split(" ");

        int cuentas = 0;
        Map<Integer, String> palabrasCantidad = new HashMap<Integer, String>();


        for (int i = 0; i < fraseArray.length; i++) {
            for (int j = 0; j < fraseArray.length; j++) {
                if(fraseArray[i].equals(fraseArray[j])){
                    cuentas++;
                }
            }
            if(cuentas > 1){
                palabrasCantidad.put(cuentas, fraseArray[i]);
                cuentas = 0;
            }
        }
        //palabrasCantidad.forEach((k, v) -> System.out.println(v + ": " + k));
        //Para ordenar las ocurrencias
        Map<Integer, String> palabrasOrden = new TreeMap<Integer, String>(palabrasCantidad);
        Iterator it = palabrasOrden.keySet().iterator();

        while (it.hasNext()) {
            int key = (int)it.next();
            System.out.println("Palabra: " + palabrasOrden.get(key) + ". Cantidad " + key);
    }
}
}