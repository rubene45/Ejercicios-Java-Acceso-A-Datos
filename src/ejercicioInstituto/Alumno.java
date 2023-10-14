package ejercicioInstituto;

public class Alumno extends Persona {
    /*atributos*/
    private int iNota;

    /*constructores*/
    public Alumno(String paramNombre, int paramEdad, String paramAulaAsignada, int paramNota) throws Exception {
        super(paramNombre, paramEdad, paramAulaAsignada);
        
        if (validarNota(paramNota)) {
            this.iNota = paramNota;
        }
        else {
            throw new Exception("Error: Nota no válida.");
        }

    }

    public static boolean validarNota(int paramNota) {
        if (paramNota >= 0 || paramNota <= 10) {
            return true;
        }
        else {
            return false;
        }
    }

    /*metodos*/
    public int getiNota() {
        return iNota;
    }

    public void setiNota(int iNota) {
        this.iNota = iNota;
    }

    @Override
    public String toString() {
        return " Alumno [iNota=" + iNota + ", " + super.toString() + "]";
    }
    
}
