import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", getName(), centerStar.getName(),
                getDistanceBetween(this, centerStar));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Planet otherObject = (Planet) object;
        return Double.compare(otherObject.getX(), getX()) == 0 &&
                Double.compare(otherObject.getY(), getY()) == 0 &&
                Double.compare(otherObject.getZ(), getZ()) == 0 &&
                getName().equals(otherObject.getName()) &&
                otherObject.centerStar.equals(centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getX(), getY(), getZ(), centerStar);
    }

}
