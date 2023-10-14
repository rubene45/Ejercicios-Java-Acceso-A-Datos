package ejercicioImpresoras;

public class ImpresoraTest {
    public static void main(String[] args) {
        ImpresoraLaser laser1 = new ImpresoraLaser(55);
        laser1.imprimir("Texto desde la impresora láser");

        ImpresoraTinta tinta1 = new ImpresoraTinta(20);
        tinta1.imprimir("Texto con tinta");

        System.out.println("¿Es láser más rápida que tinta?: "+laser1.esMasRapidaQue(tinta1));
    }
}
