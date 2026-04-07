public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Test Sheep
        System.out.println("=== Animal: Sheep ===");
        Sheep sheep = (Sheep) registry.createSheep();
        sheep.setName("Choco");
        displayAnimalInfo(sheep);

        // Test Cow
        System.out.println("\n=== Animal: Cow ===");
        Cow cow = (Cow) registry.createCow();
        cow.setName("Vanilla");
        displayAnimalInfo(cow);

        // Test Horse
        System.out.println("\n=== Animal: Horse ===");
        Horse horse = (Horse) registry.createHorse();
        horse.setName("Mocha");
        displayAnimalInfo(horse);
    }

    private static void displayAnimalInfo(Animal animal) {
        if (animal instanceof Sheep) {
            Sheep s = (Sheep) animal;
            printDetails(s.getType(), s.getName(), s.getLegs(), s.getFood());
            System.out.print("Sound: ");
            s.makeSound();
        } else if (animal instanceof Cow) {
            Cow c = (Cow) animal;
            printDetails(c.getType(), c.getName(), c.getLegs(), c.getFood());
            System.out.print("Sound: ");
            c.makeSound();
        } else if (animal instanceof Horse) {
            Horse h = (Horse) animal;
            printDetails(h.getType(), h.getName(), h.getLegs(), h.getFood());
            System.out.print("Sound: ");
            h.makeSound();
        }
    }

    private static void printDetails(String type, String name, Integer legs, String food) {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Legs: " + legs);
        System.out.println("Food: " + food);
    }
}