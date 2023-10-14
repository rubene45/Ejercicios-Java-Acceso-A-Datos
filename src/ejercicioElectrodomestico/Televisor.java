package ejercicioElectrodomestico;

public class Televisor extends Electrodomestico {
    private double resolucion;

    public Televisor() {
        super();
        this.resolucion = 32.0;
    }

    public Televisor(String marca, String modelo, double precio, String color, int potenciaWatios, double horasUsoDiario, int diasUsoAnuales, double precioEnergiaKWh, double resolucion) {
        super(marca, modelo, precio, color, potenciaWatios, horasUsoDiario, diasUsoAnuales, precioEnergiaKWh);
        this.resolucion = resolucion;
    }

    public double consumoAnual() {
        double consumoAnual = super.consumoAnual();

        if (resolucion > 50.0) {
            consumoAnual += 30.0;
        }

        return consumoAnual;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisor [resolucion=" + resolucion + "]";
    }

}
