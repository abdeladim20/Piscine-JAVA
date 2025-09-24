import java.util.Objects;

public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    public static final double KM_IN_ONE_AU = 150_000_000;

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

    public static double getDistanceBetween(CelestialObject object1, CelestialObject object2) {
        return Math.sqrt(Math.pow((object2.x - object1.x), 2) + Math.pow((object2.y - object1.y), 2)
                + Math.pow((object2.z - object1.z), 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject object1, CelestialObject object2) {
        double result = getDistanceBetween(object1, object2) * KM_IN_ONE_AU;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        CelestialObject otherObject = (CelestialObject) object;
        return Double.compare(otherObject.x, x) == 0 &&
                Double.compare(otherObject.y, y) == 0 &&
                Double.compare(otherObject.z, z) == 0 &&
                name.equals(otherObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z);
    }
}

/*
 * Terre is positioned at (1.000, 2.000, 2.000)
 * true
 * false
 * 2129490293
 * -1811995559
 */