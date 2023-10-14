package ejercicioInstituto;

import java.util.ArrayList;

public class InstitutoTestRuben {
    public static void main(String[] args) {
        try {
            Profesor profesorJuan = new Profesor("Juan", 46, "2.6", "Base de Datos");
            Profesor profesorDavid = new Profesor("David", 35, "2.6", "Programación");
            Profesor profesorRoberto = new Profesor("Roberto", 37, "2.7", "Ofimatica");
            Profesor profesorSergio = new Profesor("Sergio", 25, "2.7", "Montaje y mantenimiento");
            Profesor profesorMiguel = new Profesor("Miguel", 30, "2.7", "Aplicaciones Web");

            ArrayList<Profesor> listaProfesores1 = new ArrayList<Profesor>();
            ArrayList<Profesor> listaProfesores2 = new ArrayList<Profesor>();
            
            listaProfesores1.add(profesorJuan);
            listaProfesores1.add(profesorDavid);
            listaProfesores2.add(profesorRoberto);
            listaProfesores2.add(profesorSergio);
            listaProfesores2.add(profesorMiguel);

            Alumno alumnoRuben = new Alumno("Ruben", 20, "2.6", 10);
            Alumno alumnoAlba = new Alumno("Alba", 22, "2.6", 10);
            Alumno alumnoJaime = new Alumno("Jaime", 20, "2.6", 8);
            Alumno alumnoJavier = new Alumno("Javier", 28, "2.6", 7);
            Alumno alumnoAbdel = new Alumno("Abdel", 20, "2.6", 3);

            Alumno alumnoBruno = new Alumno("Bruno", 26, "2.7", 5);
            Alumno alumnoAdrian = new Alumno("Adrian", 22, "2.7", 4);
            Alumno alumnoAlex = new Alumno("Alex", 28, "2.7", 5);
            Alumno alumnoMaria = new Alumno("Maria", 41, "2.7", 6);
            Alumno alumnoRaul = new Alumno("Raul", 22, "2.7", 9);

            ArrayList<Alumno> listaAlumnos1 = new ArrayList<Alumno>();
            ArrayList<Alumno> listaAlumnos2 = new ArrayList<Alumno>();
            
            listaAlumnos1.add(alumnoRuben);
            listaAlumnos1.add(alumnoAlba);
            listaAlumnos1.add(alumnoJaime);
            listaAlumnos1.add(alumnoJavier);
            listaAlumnos1.add(alumnoAbdel);

            listaAlumnos2.add(alumnoBruno);
            listaAlumnos1.add(alumnoAdrian);
            listaAlumnos1.add(alumnoAlex);
            listaAlumnos1.add(alumnoMaria);
            listaAlumnos1.add(alumnoRaul);
            
            Aula aula26 = new Aula("2.6", listaProfesores1, listaAlumnos1);
            Aula aula27 = new Aula("2.7", listaProfesores2, listaAlumnos2);
            System.out.println("Aula 2.6: "+aula26);
            System.out.println("Aula 2.7: "+aula27);
        }   
        catch (Exception e) {
            System.out.println(e);
        }
    }
}