package ejercicioPersona;

import java.util.Random;

public class Persona {
    private String sNombre;
    private int iEdad;
    private String sDNI;
    private char cSexo;
    private double dPeso;
    private double dAltura;

    public Persona() {
        this.sNombre = "";
        this.iEdad = 0;
        this.sDNI = "";
        this.cSexo = 'H';
        this.dPeso = 0;
        this.dAltura = 0;
    }

    public Persona(String sNombre, int iEdad, char cSexo) {
        this.sNombre = sNombre;
        this.iEdad = iEdad;
        this.cSexo = cSexo;
        this.sDNI = generarDNI();
    }

    public Persona(String sNombre, int iEdad, char cSexo, double dPeso, double dAltura) {
        this.sNombre = sNombre;
        this.iEdad = iEdad;
        this.sDNI = generarDNI();
        this.cSexo = cSexo;
        this.dPeso = dPeso;
        this.dAltura = dAltura;
    }
    
    public int calcularIMC() {
        return (int) (dPeso / Math.pow(dAltura, 2));
    }

    private boolean validarDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int resto = Integer.parseInt(sDNI.substring(0, 7)) % 23;

        if (resto == letras.charAt(resto)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validarSexo() {
        if (this.cSexo == 'H' || this.cSexo == 'M') {
            return true;
        } else {
            return false;
        }
    }

    private String generarDNI() {
        Random rand = new Random();

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int numeroDNI = rand.nextInt(90000000) + 10000000;

        int resto = numeroDNI % 23;

        return String.valueOf(numeroDNI) + letras.charAt(resto);
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsDNI() {
        return sDNI;
    }

    public void setsDNI(String sDNI) {
        this.sDNI = sDNI;
    }

    public char getcSexo() {
        return cSexo;
    }

    public void setcSexo(char cSexo) {
        this.cSexo = cSexo;
    }

    public double getdPeso() {
        return dPeso;
    }

    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    public double getdAltura() {
        return dAltura;
    }

    public void setdAltura(double dAltura) {
        this.dAltura = dAltura;
    }

    @Override
    public String toString() {
        return "Persona [sNombre=" + sNombre + ", iEdad=" + iEdad + ", sDNI=" + sDNI + ", cSexo=" + cSexo + ", dPeso="
                + dPeso + ", dAltura=" + dAltura + "]";
    }

    
}
