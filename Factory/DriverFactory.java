public class DriverFactory {
    public static Driver getDriver(String type) {
        if ("Car".equals(type)) {
            return new CarDriver();
        } else if ("Plane".equals(type)) {
            return new PlaneDriver();
        }
        return null;
    }  
}
