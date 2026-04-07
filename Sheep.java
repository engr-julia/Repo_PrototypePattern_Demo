public class Sheep implements Animal {
    private String type = "Sheep", sound = "Baa", food = "Grass", name;
    private Integer legs = 4;

    @Override public void makeSound() { System.out.println(this.sound); }
    @Override public Animal clone() { return new Sheep(); }
    @Override public String getType() { return this.type; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    public Integer getLegs() { return this.legs; }
    public String getFood() { return this.food; }
}