package ejercicioFigurasAbstractas;

abstract class Figura {
    double total = 0;
    
    public void mostrarArea() {
        System.out.println("Área calculada de "+this.getClass()+" es: "+total);
    }

    abstract public void calcularArea();
}
