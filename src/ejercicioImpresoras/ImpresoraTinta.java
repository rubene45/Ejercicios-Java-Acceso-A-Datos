package ejercicioImpresoras;

public class ImpresoraTinta implements Impresora {
    private int velocidad;

    public ImpresoraTinta(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimiendo desde impresora de tinta: " + texto);
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
