public class Horse implements Animal {
    private String type;
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public Horse() {
        this.type = "Horse";
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
    }

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public Animal clone() {
        // Logic remains: returns a new Horse instance with default values
        return new Horse();
    }

    @Override
    public String getType() {
        return this.type;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLegs() {
        return this.legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}