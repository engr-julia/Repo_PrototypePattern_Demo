import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public AnimalRegistry() {
        // Initialize the master copies
        prototypes.put("sheep", new Sheep());
        prototypes.put("cow", new Cow());
        prototypes.put("horse", new Horse());
    }

    public Animal createSheep() {
        return prototypes.get("sheep").clone();
    }

    public Animal createCow() {
        return prototypes.get("cow").clone();
    }

    public Animal createHorse() {
        return prototypes.get("horse").clone();
    }
}