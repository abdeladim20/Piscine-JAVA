public class TransportFactory {
    public int getTransport(String type) {
        if ("Car".equals(type)) {
            return new Car().getDistance();
        }
        return new Plane().getDistance();
    }
}