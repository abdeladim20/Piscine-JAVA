public class CelestialObject {
    double x;
    double y;
    double z;
    String name;
    public static final double KM_IN_ONE_AU  = 150_000_000; 

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    };

    public CelestialObject(String name2, double x2, double y2, double z2) {
        name = name2;
        x = x2;
        y = y2;
        z = z2;
    };

    public double getX() {
        return x;
    }

    public void setX(double x2) {
        x = x2;
    }

    public double getY() {
        return y;
    }

    public void setY(double y2) {
        y = y2;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z2) {
        z = z2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        name = name2;
    }

    public static double getDistanceBetween(CelestialObject object1, CelestialObject object2){
        return Math.sqrt(Math.pow((object2.x - object1.x), 2) + Math.pow((object2.y - object1.y), 2) + Math.pow((object2.z - object1.z), 2));
    }
    public static double getDistanceBetweenInKm(CelestialObject object1, CelestialObject object2){
        double result = getDistanceBetween(object1, object2) * KM_IN_ONE_AU;
        return result;
    }
}

/*
 * 3.0
 * 4.5E8
 * 1.5E8
 */