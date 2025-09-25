import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Galaxy {
    private  List<CelestialObject> celestialObjects;
    public Galaxy() {
        celestialObjects = new ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        celestialObjects.add(celestialObject);
    }

    public HashMap<String, Integer> computeMassRepartition() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Planet", 0);
        map.put("Star", 0);
        map.put("Other", 0);
        for (CelestialObject obj : this.celestialObjects) {
            String name =  obj instanceof Planet ? "Planet" : obj instanceof Star ? "Star" : "Other" ;
            map.put(name, map.get(name) + obj.getMass());
        }

        return map;
    }
}
