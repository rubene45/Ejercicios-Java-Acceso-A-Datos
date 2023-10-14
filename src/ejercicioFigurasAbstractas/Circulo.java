package ejercicioFigurasAbstractas;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        total = Math.PI * radio * radio;
    }
}
