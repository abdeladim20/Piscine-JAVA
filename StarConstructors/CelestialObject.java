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
    }
}
/*
 * 0.0
 * 0.0
 * 0.0
 * Soleil
 * 0.43
 * 0.98
 * 1.43
 * Terre
 */