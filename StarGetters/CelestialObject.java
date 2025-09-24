public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;

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

}