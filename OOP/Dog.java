package OOP;

public class Dog {

    private String name;
    private double weight;

    public Dog() {}

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark() {
        System.out.println(this.name + " goes WOOF!");
    }

    public void sit() {
        System.out.println(this.name + " is sitting...");
    }
    
}
