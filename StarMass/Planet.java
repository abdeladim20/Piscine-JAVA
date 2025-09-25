public class Planet extends CelestialObject{
    private Star centerStar;
    
    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void  setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", getName(), centerStar.getName(), getDistanceBetween(this, centerStar));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Planet other = (Planet) obj;
        return getName().equals(other.getName()) &&
                Double.compare(getX(), other.getX()) == 0 &&
                Double.compare(getY(), other.getY()) == 0 &&
                Double.compare(getZ(), other.getZ()) == 0 &&
                getMass() == other.getMass() &&
                centerStar.equals(other.centerStar);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getName(), getX(), getY(), getZ(), centerStar, getMass());
    }
}