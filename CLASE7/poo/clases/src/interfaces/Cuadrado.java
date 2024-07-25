package interfaces;

public class Cuadrado implements Figura,Dibujable,Rotable {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }


    //IMPLEMENTAMOS LOS ABSTRACTOS DE LAS INTERFASES

    @Override
    public double calcularArea() {
        double result = lado*lado;
        return result;
    }

    @Override
    public void dibujable() {
        System.out.println("Estoy dibujando un cuadrado");
    }

    @Override
    public void rotable() {
        System.out.println("Hola estoy rotando el cuadrado");
    }
}
