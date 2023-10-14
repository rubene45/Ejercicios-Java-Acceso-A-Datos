package ejercicio3Parking;

public class ParkingTestRuben {
    public static void main(String[] args) {
        try {
            ParkingVehiculosRuben parking = new ParkingVehiculosRuben("Calle Alcalá, 148");
    
            VehiculoRuben vehiculo1 = new VehiculoRuben("9957CMF");
            VehiculoRuben vehiculo2 = new VehiculoRuben("7798JHD");
            VehiculoRuben vehiculo3 = new VehiculoRuben("8291BDL");
            VehiculoRuben vehiculo4 = new VehiculoRuben("2160KFL");
            VehiculoRuben vehiculo5 = new VehiculoRuben("3152MFS");
    
            parking.aparcaCoche(vehiculo1);
            parking.aparcaCoche(vehiculo2);
            parking.aparcaCoche(vehiculo3);
            parking.aparcaCoche(vehiculo4);
            parking.aparcaCoche(vehiculo5);
            
            Thread.sleep(120 * 1000);
            
            parking.sacaCoche(vehiculo1);
            parking.sacaCoche(vehiculo2);
            parking.sacaCoche(vehiculo3);
            parking.sacaCoche(vehiculo4);
            parking.sacaCoche(vehiculo5);

            parking.getFactura(vehiculo1);
            parking.getFactura(vehiculo2);
            parking.getFactura(vehiculo3);
            parking.getFactura(vehiculo4);
            parking.getFactura(vehiculo5);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
