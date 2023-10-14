package ejercicio2Ordenadores;

public class Sobremesa extends Ordenador {
    private String sDescripcion;

    public Sobremesa(int iCodigo, String sRAM, String sCPU, double dPrecio, String sDescripcion) {
        super(iCodigo, sRAM, sCPU, dPrecio);
        this.sDescripcion = sDescripcion;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    @Override
    public String toString() {
        return "Sobremesa [sDescripcion=" + sDescripcion + "]";
    }

    
}
