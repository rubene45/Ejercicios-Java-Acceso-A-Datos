package ejercicio3Parking;

import java.time.LocalDateTime;

public class ParkingVehiculosRuben implements ParkingRuben {
    /*atributos*/
    private static final double PRECIO_MINUTO = 0.0425;
    private static final int MAX_PLAZAS = 100;
    private String sDireccion;
    private int iPlazasOcupadas;

    /*constructores*/
    public ParkingVehiculosRuben(String paramDireccion) {
        this.sDireccion = paramDireccion;
        this.iPlazasOcupadas = 0;
    }

    /*metodos*/
    public boolean hayPlaza() {
        if (iPlazasOcupadas == MAX_PLAZAS) {
            return false;
        }
        else {
            return true;
        }
    }

    public void aparcaCoche(VehiculoRuben paramCoche) throws Exception {
        if (paramCoche.getFechaInicioEstacionamiento() == null) {
            if (hayPlaza()) {
                paramCoche.setFechaInicioEstacionamiento(LocalDateTime.now());
                iPlazasOcupadas++;
            }
            else {
                throw new Exception("Error: No hay plazas disponibles.");
            }
        }
        else {
            throw new Exception("Error: El coche ya se encuentra aparcado.");
        }    
    }

    public void sacaCoche(VehiculoRuben paramCoche) throws Exception {
        if (paramCoche.getFechaInicioEstacionamiento() != null) {
            if (paramCoche.getFechaFinEstacionamiento() == null) {
                paramCoche.setFechaFinEstacionamiento(LocalDateTime.now());
                iPlazasOcupadas--;
            }
            else {
                throw new Exception("Error: El coche ya no se encuentra en el garaje.");
            }
        }
        else {
            throw new Exception("Error: El coche no se encuentra aparcado. ");
        }
    }

    public double getFactura(VehiculoRuben paramCoche) throws Exception {
        double dFactura = 0;
        int iDias = 0;
        int iHoras = 0;
        int iMinutos = 0;

        if (paramCoche.getFechaFinEstacionamiento() != null && paramCoche.getFechaInicioEstacionamiento() != null) { // Comprobamos si el coche ha sido estacionado y que ha sido sacado del parking.
           iDias = paramCoche.getFechaFinEstacionamiento().getDayOfYear() - paramCoche.getFechaInicioEstacionamiento().getDayOfYear();
           iHoras = paramCoche.getFechaFinEstacionamiento().getHour() - paramCoche.getFechaInicioEstacionamiento().getHour();
           iMinutos = paramCoche.getFechaFinEstacionamiento().getMinute() - paramCoche.getFechaInicioEstacionamiento().getMinute();
           
           dFactura = (1440 * iDias + 60 * iHoras + iMinutos) * PRECIO_MINUTO;

           paramCoche.setFechaFinEstacionamiento(null);
           paramCoche.setFechaInicioEstacionamiento(null);
        }
        else {
            throw new Exception("Error: No se puedo calcular la factura ya que el vehículo no se encuentra aparcado en el parking, o sigue aparcado en el parking.");
        }

        return dFactura;
    }
}
