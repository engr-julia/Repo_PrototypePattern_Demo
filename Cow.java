public class Cow implements Animal {
    private String type;
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public Cow(){
        this.type = "Cow";
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
    }

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public Animal clone() {
        return new Cow();
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