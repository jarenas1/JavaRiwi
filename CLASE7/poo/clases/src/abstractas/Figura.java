package abstractas;

public abstract class Figura {

    protected double x;
    protected double y;

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected Figura() {
    }

    //CREACION DEL METODO ABSTRACTO, ESTE DEBE SER USADO SIII O SIII POR LAS CLASES HIJAS

    public abstract double calcularArea();
}
