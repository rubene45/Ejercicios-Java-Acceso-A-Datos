package ejercicio3Parking;

public interface ParkingRuben {

    public boolean hayPlaza();

    public void aparcaCoche(VehiculoRuben paramCoche) throws Exception;
    
    public void sacaCoche(VehiculoRuben paramCoche) throws Exception;

    public double getFactura(VehiculoRuben paramCoche) throws Exception;
}