package ejercicio4Punto;

public class Punto {
    protected int iCoordenadaX;
    protected int iCoordenadaY;

    public Punto(int iCoordenadaX, int iCoordenadaY) {
        this.iCoordenadaX = iCoordenadaX;
        this.iCoordenadaY = iCoordenadaY;
    }

    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.iCoordenadaX - iCoordenadaX, 2) + Math.pow(otroPunto.iCoordenadaY - iCoordenadaY, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;
        if (iCoordenadaX != other.iCoordenadaX)
            return false;
        if (iCoordenadaY != other.iCoordenadaY)
            return false;
        return true;
    }

    
}
