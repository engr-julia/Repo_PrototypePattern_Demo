public class Cow implements Animal {
    private String type = "Cow", sound = "Moo", food = "Grass", name;
    private Integer legs = 4;

    @Override public void makeSound() { System.out.println(this.sound); }
    @Override public Animal clone() { return new Cow(); }
    @Override public String getType() { return this.type; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    public Integer getLegs() { return this.legs; }
    public String getFood() { return this.food; }
}