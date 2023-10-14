package ejercicioNumeroComplejo;

public class Complejo {
    private double dPReal;
    private double dPImag;
    
    public void asignar(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;
    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        Complejo num = new Complejo();
        num.asignar(c1.dPReal+c2.dPReal, c1.dPImag+c2.dPImag);
        return num;
    }
    
    public void imprimir() {
        System.out.println(this.dPReal + " + " + this.dPImag + "i");
    }
}

