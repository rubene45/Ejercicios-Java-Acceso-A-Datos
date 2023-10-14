package ejercicioPersona;

import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad: ");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo (H/M): ");
        String prueba = scanner.nextLine();
        char sexo = prueba.charAt(0);

        System.out.println("Introduce el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la altura en metros: ");
        double altura = scanner.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();
        persona3.setsNombre("Persona3");
        persona3.setiEdad(30);
        persona3.setcSexo('M');
        persona3.setdPeso(70.5);
        persona3.setdAltura(1.75);

        int imcPersona1 = persona1.calcularIMC();
        int imcPersona2 = persona2.calcularIMC();
        int imcPersona3 = persona3.calcularIMC();

        System.out.println("IMC Persona 1: " + imcPersona1);
        System.out.println("IMC Persona 2: " + imcPersona2);
        System.out.println("IMC Persona 3: " + imcPersona3);

        System.out.println("Datos de Persona 1: " + persona1.toString());
        System.out.println("Datos de Persona 2: " + persona2.toString());
        System.out.println("Datos de Persona 3: " + persona3.toString());

    }
}
