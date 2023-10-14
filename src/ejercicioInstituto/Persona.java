package ejercicioInstituto;

import java.util.Arrays;

public abstract class Persona {
    /*atributos*/
    private String sNombre;
    private int iEdad;
    private String aulaAsignada;

    /*constructores*/
    public Persona(String paramNombre, int paramEdad, String paramAulaAsignada) throws Exception {
        /*Válidamos si el alumno está en la lista de alumnos*/
        if (this instanceof Alumno) {
            /*compruebo que paramNombre está en la lista de alumno*/
            if (!Arrays.asList(ConstantesRuben.LISTA_ALUMNOS).contains(paramNombre)) {
                throw new Exception("Error: El nombre del alumno no ha sido encontrado.");
            }
        }
        else if (this instanceof Profesor) {
            /*compruebo que profesor está en la lista de profesor*/
            if (!Arrays.asList(ConstantesRuben.LISTA_PROFESORES).contains(paramNombre)) {
                throw new Exception("Error: El nombre del profesor no ha sido encontrado.");
            }
        }
        this.sNombre = paramNombre;
        this.iEdad = paramEdad;
        this.aulaAsignada = paramAulaAsignada;
    }

    /*metodos*/
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

    public String getAulaAsignada() {
        return aulaAsignada;
    }

    public void setAulaAsignada(String aulaAsignada) {
        this.aulaAsignada = aulaAsignada;
    }

    @Override
    public String toString() {
        return "Persona [sNombre=" + sNombre + ", iEdad=" + iEdad + ", aulaAsignada=" + aulaAsignada + "]";
    }

}
