public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Simple loop to show 3 distinct generations in one run
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n=== 🐾 GENERATION " + i + " ===");
            
            displayAnimalInfo(registry.createSheep());
            displayAnimalInfo(registry.createCow());
            displayAnimalInfo(registry.createHorse());
            
            System.out.println("-----------------------");
        }
    }

    private static void displayAnimalInfo(Animal animal) {
        String name = "", food = "";
        Integer legs = 0;

        // Simple casting to get data from the clones
        if (animal instanceof Sheep) {
            Sheep s = (Sheep) animal;
            name = s.getName(); legs = s.getLegs(); food = s.getFood();
        } else if (animal instanceof Cow) {
            Cow c = (Cow) animal;
            name = c.getName(); legs = c.getLegs(); food = c.getFood();
        } else if (animal instanceof Horse) {
            Horse h = (Horse) animal;
            name = h.getName(); legs = h.getLegs(); food = h.getFood();
        }

        System.out.println(animal.getType() + ": " + name + " | Legs: " + legs + " | Food: " + food);
        System.out.print("Sound: ");
        animal.makeSound();
    }
}