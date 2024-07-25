package interfaces;

//DECIMOS QUE ESTABAMOS IMPLEMENTANDO UNA CLASE
public class Circulo implements Figura{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        double result = 3.14*(radio*radio);
        return result;
    }
}
