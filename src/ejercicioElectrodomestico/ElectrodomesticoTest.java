package ejercicioElectrodomestico;

import java.util.ArrayList;

public class ElectrodomesticoTest {
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Electrodomestico("Samsung", "1234", 600.0, "negro", 1500, 4, 5, 0.15));
        electrodomesticos.add(new Nevera("LG", "N567", 800.0, "blanco", 1000, 24, 365, 0.16, 400, 200, 40));
        electrodomesticos.add(new Televisor("Sony", "TVX1", 700.0, "plateado", 500, 10, 300, 0.14, 50));
        electrodomesticos.add(new Electrodomestico("Panasonic", "6789", 300.0, "plata", 1000, 6, 4, 0.12));

        double sumaTotalConsumo = 0.0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            double consumoAnual = electrodomestico.consumoAnual();
            System.out.println("Consumo anual del " + electrodomestico.getClass().getSimpleName() + ": " + consumoAnual + " €");
            sumaTotalConsumo += consumoAnual;
        }

        System.out.println("Suma total de consumo anual de todos los electrodomésticos: " + sumaTotalConsumo + " €");
    }
}