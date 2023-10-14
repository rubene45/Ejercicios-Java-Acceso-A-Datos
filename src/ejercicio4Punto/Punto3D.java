package ejercicio4Punto;

public class Punto3D extends Punto {
    private int iCoordenadaZ;

    public Punto3D(int iCoordenadaX, int iCoordenadaY, int iCoordenadaZ) {
        super(iCoordenadaX, iCoordenadaY);
        this.iCoordenadaZ = iCoordenadaZ;
    }

    public double distancia(Punto3D otroPunto3d) {
        double dx = iCoordenadaX - otroPunto3d.iCoordenadaX;
        double dy = iCoordenadaY - otroPunto3d.iCoordenadaY;
        double dz = iCoordenadaZ - otroPunto3d.iCoordenadaZ;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto3D other = (Punto3D) obj;
        if (iCoordenadaZ != other.iCoordenadaZ)
            return false;
        return true;
    }

    
}
