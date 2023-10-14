package ejercicio2Ordenadores;

public class Ordenador {
    private int iCodigo;
    private String sRAM;
    private String sCPU;
    private double dPrecio;

    public Ordenador(int iCodigo, String sRAM, String sCPU, double dPrecio) {
        this.iCodigo = iCodigo;
        this.sRAM = sRAM;
        this.sCPU = sCPU;
        this.dPrecio = dPrecio;
    }

    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public String getsRAM() {
        return sRAM;
    }

    public void setsRAM(String sRAM) {
        this.sRAM = sRAM;
    }

    public String getsCPU() {
        return sCPU;
    }

    public void setsCPU(String sCPU) {
        this.sCPU = sCPU;
    }

    public double getdPrecio() {
        return dPrecio;
    }
    
    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    @Override
    public String toString() {
        return "Ordenador [iCodigo=" + iCodigo + ", sRAM=" + sRAM + ", sCPU=" + sCPU + ", dPrecio=" + dPrecio + "]";
    }

    public String getCaracteristicas() {
        return "CPU: " + sCPU + " RAM: " + sRAM;
    }
}
