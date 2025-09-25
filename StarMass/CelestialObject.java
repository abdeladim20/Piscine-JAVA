public class CelestialObject {
    private double x, y, z;
    private String name;
    private int mass;


    public static final double KM_IN_ONE_AU = 150_000_000;

    public CelestialObject() {
        name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass;
        this.name = name;
    }
    
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        return Math.sqrt(Math.pow((obj2.x - obj1.x), 2) + Math.pow((obj2.y - obj1.y), 2) + Math.pow((obj2.z - obj1.z), 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        CelestialObject other = (CelestialObject) obj;
        return this.name.equals(other.name) &&
                Double.compare(this.x, other.x) == 0 &&
                Double.compare(this.y, other.y) == 0 &&
                this.mass == other.mass &&
                Double.compare(this.z, other.z) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z, mass);
    }
}