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

    double getX() {
        return x;
    }

    void setX(double x2) {
        x = x2;
    }

    double getY() {
        return y;
    }

    void setY(double y2) {
        y = y2;
    }

    double getZ() {
        return z;
    }

    void setZ(double z2) {
        z = z2;
    }

    String getName() {
        return name;
    }

    void setName(String name2) {
        name = name2;
    }

}