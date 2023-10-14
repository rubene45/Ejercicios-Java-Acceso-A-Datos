package ejercicio1CuentaBancaria;

public class Cuenta {
    private static final double MAX_RETIRO = 3000;
    private static final double MAX_INGRESO = 6000;

    private String sDni;
    private String sNombre;
    private String sNumCuenta;
    private double dSaldo;


    public Cuenta(String sDni, String sNombre, String sNumCuenta, double dSaldo) throws Exception {
        if (validarCuentaBancaria(sNumCuenta)) {
            this.sDni = sDni;
            this.sNombre = sNombre;
            this.sNumCuenta = sNumCuenta;
            this.dSaldo = dSaldo;
        } else {
            throw new Exception("ERROR: IBAN no válido.");
        }
    }

    
    public Cuenta(String sNumCuenta, double dSaldo) throws Exception {
        if (validarCuentaBancaria(sNumCuenta)) {
            this.sNumCuenta = sNumCuenta;
            this.dSaldo = dSaldo;
        } else {
            throw new Exception("ERROR: IBAN no válido.");
        }
    }

    public boolean validarCuentaBancaria(String sIBAN) {

        if (sIBAN.length() < 4) {
            return false;
        }

        if (!Character.isLetter(sIBAN.charAt(0)) || !Character.isLetter(sIBAN.charAt(1))) {
            return false;
        }

        for (int i = 2; i < sIBAN.length(); i++) {
            char c = sIBAN.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                return false;
            }
        }

        sIBAN = sIBAN.substring(4) + sIBAN.substring(0, 4);

        String sDigitos = "";

        for (int i = 0; i < sIBAN.length(); i++) {
            char c = sIBAN.charAt(i);
            if (Character.isLetter(c)) {
                sDigitos += Character.getNumericValue(c);
            } else {
                sDigitos += c;
            }
        }
        try {
            long ibanNumeric = Long.parseLong(sDigitos);
            return ibanNumeric % 97 == 1;
        } catch (NumberFormatException e) {
            return false;
        }
    }
  

    public String getsNumCuenta() {
        return sNumCuenta;
    }

    public void setsNumCuenta(String sNumCuenta) {
        this.sNumCuenta = sNumCuenta;
    }

    public void ingresarDinero(double dCantidad) {
        if (dCantidad <= 0) {
            System.out.println("ERROR: La cantidad a ingresar debe ser mayor que cero.");
        } else if (dCantidad > MAX_INGRESO) {
            System.out.println("ERROR: Se ha superado el importe máximo de ingreso diario.");
        } else {
            dSaldo += dCantidad;
            System.out.println("Operación de ingreso realizada correctamente.");
        }
    }

    public void sacarDinero(double dCantidad) throws Exception {
        if (dCantidad <= 0) {
            System.out.println("ERROR: La cantidad a retirar debe ser mayor que cero.");
        } else if (dCantidad > MAX_INGRESO) {
            System.out.println("ERROR: Se ha superado el importe máximo de retiro diario.");
        } else if (dSaldo < dCantidad) {
            throw new Exception("ERROR: No se permiten descubiertos en la cuenta.");
        } else {
            dSaldo += dCantidad;
            System.out.println("Operación de retiro realizada correctamente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + dSaldo);
    }

    public void cambioTitular(String sNuevoNombre) {
        this.sNombre = sNuevoNombre;
        System.out.println("Cambio de titular realizado correctamente.");
    }

}
