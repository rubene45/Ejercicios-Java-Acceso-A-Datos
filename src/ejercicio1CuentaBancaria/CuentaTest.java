package ejercicio1CuentaBancaria;

public class CuentaTest {
    
    public static void transferencia(Cuenta origen, Cuenta destino, double dImporte) {
        try {
            origen.sacarDinero(dImporte);
            destino.ingresarDinero(dImporte);
            System.out.println("Transferencia realizada correctamente.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
