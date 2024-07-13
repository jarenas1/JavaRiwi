import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class nueve {
    public static void main(String[] args) {
        String txt = "antony me va a poner cinco porque antony es un bien y antony antony carros carros casa casa casa dios";
        String[] arreglo = txt.toLowerCase().split(" ");

        int count = 0;
        Map<Integer, String> palabrasCantidad = new HashMap<Integer, String>();


        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if(arreglo[i].equals(arreglo[j])){
                    count++;
                }
            }
            if(count > 1){
                palabrasCantidad.put(count, arreglo[i]);
                count = 0;
            }
        }

        Map<Integer, String> orden = new TreeMap<Integer, String>(palabrasCantidad);
        Iterator it = orden.keySet().iterator();

        while (it.hasNext()) {
            int key = (int)it.next();
            System.out.println("palabras : " +orden.get(key) + ". Value " + key);
    }
}
}