package ejercicioInstituto;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula { 
    /*atributos*/
    private String sNombre;
    private int iNumEstudiantes;
    private ArrayList<Profesor> sProfesores;
    private ArrayList<Alumno> sAlumnos;
    private ArrayList<String> sMaterias;

    /*constructores*/
    public Aula(String paramNombre, ArrayList<Profesor> paramProfesores, ArrayList<Alumno> paramAlumnos) throws Exception {
        if (!Arrays.asList(ConstantesRuben.LISTA_CLASES).contains(paramNombre)) {
            throw new Exception("Error: El nombre del aula no ha sido encontrado.");
        }
        if (paramAlumnos.size() > ConstantesRuben.MAX_ESTUDIANTES) {
            throw new Exception("Error: El número de alumnos excede el límite.");
        }
        this.sNombre = paramNombre;
        this.iNumEstudiantes = paramAlumnos.size();
        this.sProfesores = paramProfesores;
        this.sAlumnos = paramAlumnos;
        this.sMaterias = new ArrayList<String>();

        for (int i=0; i<paramProfesores.size(); i++) {
            sMaterias.add(paramProfesores.get(i).getsMateria());
        }
    }
    
    /*metodos*/
    @Override
    public String toString() {
        return "Aula [sNombre=" + sNombre + ", iNumEstudiantes=" + iNumEstudiantes + ", sProfesores=" + sProfesores
                + ", sAlumnos=" + sAlumnos + ", sMaterias=" + sMaterias + "]";
    }

    
}
