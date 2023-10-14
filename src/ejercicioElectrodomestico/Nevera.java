package ejercicioElectrodomestico;

public class Nevera extends Electrodomestico {
    private double capacidadFrigorifico;
    private double capacidadCongelador;
    private double sonoridad;

    public Nevera() {
        super(); 
        this.capacidadFrigorifico = 400.0;
        this.capacidadCongelador = 200.0; 
        this.sonoridad = 50.0; 
    }

    public Nevera(String marca, String modelo, double precio, String color, int potenciaWatios, double horasUsoDiario, int diasUsoAnuales, double precioEnergiaKWh, double capacidadFrigorifico, double capacidadCongelador, double sonoridad) {
        super(marca, modelo, precio, color, potenciaWatios, horasUsoDiario, diasUsoAnuales, precioEnergiaKWh);
        this.capacidadFrigorifico = capacidadFrigorifico;
        this.capacidadCongelador = capacidadCongelador;
        this.sonoridad = sonoridad;
    }

    public double consumoAnual() {
        double consumoAnual = super.consumoAnual();

        if (capacidadFrigorifico > 300.0 || capacidadCongelador > 200.0) {
            consumoAnual += 50.0;
        }

        return consumoAnual;
    }

    public double getCapacidadFrigorifico() {
        return capacidadFrigorifico;
    }

    public void setCapacidadFrigorifico(double capacidadFrigorifico) {
        this.capacidadFrigorifico = capacidadFrigorifico;
    }

    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(double capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
    }

    public double getSonoridad() {
        return sonoridad;
    }

    public void setSonoridad(double sonoridad) {
        this.sonoridad = sonoridad;
    }

    @Override
    public String toString() {
        return "Nevera [capacidadFrigorifico=" + capacidadFrigorifico + ", capacidadCongelador=" + capacidadCongelador + ", sonoridad=" + sonoridad + "]";
    }

    
}
