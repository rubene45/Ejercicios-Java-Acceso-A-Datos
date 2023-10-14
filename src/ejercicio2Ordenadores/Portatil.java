package ejercicio2Ordenadores;

public class Portatil extends Ordenador {
    private double dPeso;

    public Portatil(int iCodigo, String sRAM, String sCPU, double dPrecio, double dPeso) {
        super(iCodigo, sRAM, sCPU, dPrecio);
        this.dPeso = dPeso;
    }

    public double getdPeso() {
        return dPeso;
    }

    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    @Override
    public String toString() {
        return "Portatil [dPeso=" + dPeso + "]";
    }
}
