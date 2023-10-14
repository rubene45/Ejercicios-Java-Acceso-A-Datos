package ejercicio3Parking;
import java.time.LocalDateTime;

public class VehiculoRuben {
    /*atributos*/
    private String sMatricula;
    private LocalDateTime fechaInicioEstacionamiento;
    private LocalDateTime fechaFinEstacionamiento;

    /*constructores*/
    public VehiculoRuben(String paramMatricula) {
        this.sMatricula = paramMatricula;
        this.fechaInicioEstacionamiento = null;
        this.fechaFinEstacionamiento = null;
    }

    /*metodos*/
    public String getsMatricula() {
        return sMatricula;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public LocalDateTime getFechaInicioEstacionamiento() {
        return fechaInicioEstacionamiento;
    }

    public void setFechaInicioEstacionamiento(LocalDateTime fechaInicioEstacionamiento) {
        this.fechaInicioEstacionamiento = fechaInicioEstacionamiento;
    }

    public LocalDateTime getFechaFinEstacionamiento() {
        return fechaFinEstacionamiento;
    }

    public void setFechaFinEstacionamiento(LocalDateTime fechaFinEstacionamiento) {
        this.fechaFinEstacionamiento = fechaFinEstacionamiento;
    }

    @Override
    public String toString() {
        return "VehiculoRuben [sMatricula=" + sMatricula + ", fechaInicioEstacionamiento=" + fechaInicioEstacionamiento
                + ", fechaFinEstacionamiento=" + fechaFinEstacionamiento + "]";
    }

    
}
