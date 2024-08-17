package CelestialObject;

import java.util.Objects;

public class CelestialObject {
    public static final double KM_IN_ONE_AU = 150_000_000;
    public double x;

    public double y;
    public double z;
    public String name;

    public CelestialObject(String celestName,double xAsis,double yAsis , double zAsis) {
        x = xAsis;
        y = yAsis;
        z = zAsis;
        name = celestName;
    }

    public CelestialObject() {
        this.name = "Sun";
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public String getName() {
        return name;
    }
    public void setX(double xAsis) {
        x = xAsis;
    }
    public void setY(double yAsis) {
        y = yAsis;
    }
    public void setZ(double zAsis) {
        z = zAsis;
    }
    public void setName(String celestName) {
        name = celestName;
    }

    public static double getDistanceBetween(CelestialObject obj1,CelestialObject obj2) {
        double deltaX = obj2.getX() - obj1.getX();
        double deltaY = obj2.getY() - obj1.getY();
        double deltaZ = obj2.getZ() - obj1.getZ();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }
    public static double  getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        return getDistanceBetween(obj1,obj2) * KM_IN_ONE_AU ;
    }
    @Override
    public  String toString() {
        return String.format("%s is positioned at (%.2f, %.2f, %.2f)",name,x,y,z);
    }
    public boolean equals(CelestialObject obj) {
        return toString().equals(obj.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}
