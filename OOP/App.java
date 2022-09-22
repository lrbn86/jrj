package OOP;

public class App {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setName("Spot");
        myDog.setWeight(34.0);
        myDog.bark();
        myDog.sit();

        Dog anotherDog = new Dog("Buster", 23.5);
        anotherDog.bark();
        anotherDog.sit();

    }
    
}
