package ejercicioImpresoras;

public interface Impresora {
    void imprimir(String texto);
    int getVelocidad();

    default boolean esMasRapidaQue(Impresora otraImpresora) {
        return this.getVelocidad() > otraImpresora.getVelocidad();
    }
}
