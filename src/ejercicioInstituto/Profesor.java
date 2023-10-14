package ejercicioInstituto;

public class Profesor extends Persona {
    /*atributos*/
    private String sMateria;
    
    /*constructores*/
    public Profesor(String paramNombre, int paramEdad, String paramAulaAsignada, String paramMateria) throws Exception {
        super(paramNombre, paramEdad, paramAulaAsignada);
        this.sMateria = paramMateria;
    }

    /*metodos*/
    public String getsMateria() {
        return sMateria;
    }

    public void setsMateria(String sMateria) {
        this.sMateria = sMateria;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [sMateria=" + sMateria + "]";
    }

} 
