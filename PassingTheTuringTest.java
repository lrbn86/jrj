import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        String name, color, fruit;
        int favoriteNumber;

        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        name = inputReader.nextLine();
        System.out.println("Hi, " + name + "! I am Brandon.");

        System.out.print("What's your favorite color? ");
        color = inputReader.nextLine();
        System.out.println("Huh, " + color + "? Mine's Electric Orange.");
        System.out.println("I really like oranges. They're my favorite fruit, too.");

        System.out.print("What's YOUR favorite fruit, " + name + "? ");
        fruit = inputReader.nextLine();
        System.out.println("Really? " + fruit + "? That's wild!");

        System.out.print("Speaking of favorites, what's your favorite number? ");
        favoriteNumber = Integer.parseInt(inputReader.nextLine());
        inputReader.close();
        System.out.println(favoriteNumber + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + favoriteNumber + " * -7 is " + (favoriteNumber * -7) + "? That's a cool number too!");

        System.out.println("Well, thanks for talking to me, " + name + "!");


    }
}
