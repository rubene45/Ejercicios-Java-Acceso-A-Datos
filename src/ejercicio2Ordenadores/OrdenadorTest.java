package ejercicio2Ordenadores;

public class OrdenadorTest {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Sobremesa(1, "8 GB", "i5-13600", 500.0, "Ordenador de sobremesa 1");
        Ordenador ordenador2 = new Portatil(2, "16 GB", "Ryzen 5 4600H", 400.0, 2.5);

        ordenador1.getCaracteristicas();
        ordenador2.getCaracteristicas();

        ordenador1.setsRAM("16 GB");
        
        ordenador1.toString();
        ordenador2.toString();
    }
}
