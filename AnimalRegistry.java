import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();
    
    private String[] sNames = {"Choco", "Berry", "Mint", "Snowball"};
    private String[] cNames = {"Vanilla", "Mocha", "Caramel"};
    private String[] hNames = {"Dark Choco", "Hazelnut", "Pistachio"};
    
    private int sIdx = 0, cIdx = 0, hIdx = 0;

    public AnimalRegistry() {
        prototypes.put("sheep", new Sheep());
        prototypes.put("cow", new Cow());
        prototypes.put("horse", new Horse());
    }

    public Animal createSheep() {
        Sheep s = (Sheep) prototypes.get("sheep").clone();
        s.setName(sNames[sIdx++ % sNames.length]);
        return s;
    }

    public Animal createCow() {
        Cow c = (Cow) prototypes.get("cow").clone();
        c.setName(cNames[cIdx++ % cNames.length]);
        return c;
    }

    public Animal createHorse() {
        Horse h = (Horse) prototypes.get("horse").clone();
        h.setName(hNames[hIdx++ % hNames.length]);
        return h;
    }
}