import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public Star(){
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Star otherObject = (Star) object;
        return Double.compare(otherObject.getX(), getX()) == 0 &&
                Double.compare(otherObject.getY(), getY()) == 0 &&
                Double.compare(otherObject.getZ(), getZ()) == 0 &&
                getName().equals(otherObject.getName()) && 
                Double.compare(otherObject.magnitude, magnitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getX(), getY(), getZ(), magnitude);
    }
}

/*
 * Naboo circles around Betelgeuse at the 12220.902 AU
 * Soleil circles around Soleil at the 0.000 AU
 * Betelgeuse shines at the 1289.300 magnitude
 */