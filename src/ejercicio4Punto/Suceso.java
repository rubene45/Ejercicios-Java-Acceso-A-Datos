package ejercicio4Punto;

import java.time.LocalDateTime;

public class Suceso extends Punto3D {
    private LocalDateTime tiempo;
    private String sDescripcion;
    
    public Suceso(int iCoordenadaX, int iCoordenadaY, int iCoordenadaZ, LocalDateTime tiempo, String sDescripcion) {
        super(iCoordenadaX, iCoordenadaY, iCoordenadaZ);
        this.tiempo = tiempo;
        this.sDescripcion = sDescripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suceso other = (Suceso) obj;
        if (tiempo == null) {
            if (other.tiempo != null)
                return false;
        } else if (!tiempo.equals(other.tiempo))
            return false;
        if (sDescripcion == null) {
            if (other.sDescripcion != null)
                return false;
        } else if (!sDescripcion.equals(other.sDescripcion))
            return false;
        return true;
    }

    
}
