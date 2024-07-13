import java.util.Scanner;

public class tres {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

                /*Ejercicio 3: Notas de un curso.
Crea un programa que calcula la calificación promedio que se necesita
obtener en las notas faltantes de un curso para aprobarlo,
considerando la cantidad de calificaciones totales, las calificaciones ya
obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
notas faltantes. Importante: el total de notas del curso será de 8 notas,
la calificación será de 0 a 100 y el promedio mínimo para aprobar el
curso es de 76*/

        System.out.println("Ingrese la cantidad de notas que tiene");
        int cantidadNotas = sc.nextInt();
        sc.nextLine();

        double[] notas = new double[cantidadNotas];

        double min = 76;

        for (int i = 1;i<=notas.length;i++){
            System.out.println("Ingrese la nota "+ i);
            notas[i-1]= sc.nextDouble();
            sc.nextLine();
        }
        
        double sumatoria = 0;
        
        for (double nota:notas){
            sumatoria +=nota;
        }
        
        if (notas.length == 8 && (sumatoria/8)>=min){
            System.out.println("Usted ya aprobo la materia");

        } else if (notas.length==8 && (sumatoria/8)<min ) {
            System.out.println("Ya perdio la materia");
        }else if (notas.length<8) {

            double totalAcumulado = min*8;
            double faltante = (totalAcumulado - sumatoria)/(8-(notas.length));
            if (faltante<0){
                System.out.println("ya gano las materias con las notas que tiene");
            }else{
                System.out.println("Usted necesita un promedio de: "+faltante+" En las notas faltantes");
            }
        }


    }
}
