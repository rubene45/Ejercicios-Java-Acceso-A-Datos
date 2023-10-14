package ejercicioElectrodomestico;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private int potenciaWatios;
    private double horasUsoDiario;
    private int diasUsoAnuales;
    private double precioEnergiaKWh;

    public Electrodomestico() {
        this.marca = "Bosch";
        this.modelo = "7200";
        this.precio = 400.0;
        this.color = "gris";
        this.potenciaWatios = 2300;
        this.horasUsoDiario = 1.0;
        this.diasUsoAnuales = 3;
        this.precioEnergiaKWh = 0.40397;
    }

    public Electrodomestico(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = "gris";
        this.potenciaWatios = 2300;
        this.horasUsoDiario = 1.0;
        this.diasUsoAnuales = 3;
        this.precioEnergiaKWh = 0.40397;
    }

    public Electrodomestico(String marca, String modelo, double precio, String color, int potenciaWatios, double horasUsoDiario, int diasUsoAnuales, double precioEnergiaKWh) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.potenciaWatios = potenciaWatios;
        this.horasUsoDiario = horasUsoDiario;
        this.diasUsoAnuales = diasUsoAnuales;
        this.precioEnergiaKWh = precioEnergiaKWh;
    }

    public double consumoAnual() {
        double consumoDiarioKWh = (potenciaWatios * horasUsoDiario) / 1000;
        double consumoAnualKWh = consumoDiarioKWh * diasUsoAnuales * 365;
        return consumoAnualKWh * precioEnergiaKWh;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotenciaWatios() {
        return potenciaWatios;
    }

    public void setPotenciaWatios(int potenciaWatios) {
        this.potenciaWatios = potenciaWatios;
    }

    public double getHorasUsoDiario() {
        return horasUsoDiario;
    }

    public void setHorasUsoDiario(double horasUsoDiario) {
        this.horasUsoDiario = horasUsoDiario;
    }

    public int getDiasUsoAnuales() {
        return diasUsoAnuales;
    }

    public void setDiasUsoAnuales(int diasUsoAnuales) {
        this.diasUsoAnuales = diasUsoAnuales;
    }

    public double getPrecioEnergiaKWh() {
        return precioEnergiaKWh;
    }

    public void setPrecioEnergiaKWh(double precioEnergiaKWh) {
        this.precioEnergiaKWh = precioEnergiaKWh;
    }

    @Override
    public String toString() {
        return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
                + ", potenciaWatios=" + potenciaWatios + ", horasUsoDiario=" + horasUsoDiario + ", diasUsoAnuales="
                + diasUsoAnuales + ", precioEnergiaKWh=" + precioEnergiaKWh + "]";
    }

    
}
