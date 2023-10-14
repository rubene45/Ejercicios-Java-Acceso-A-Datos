package ejercicioNumeroComplejo;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo num1 = new Complejo();
        Complejo num2 = new Complejo();

        num1.asignar(3, 4);
        num2.asignar(3, 3);
        num1.sumar(num1, num2).imprimir();
    }
}

