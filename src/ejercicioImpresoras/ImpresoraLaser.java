package ejercicioImpresoras;

public class ImpresoraLaser implements Impresora {
    private int velocidad;

    public ImpresoraLaser(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimiendo desde impresora láser: " + texto);
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
