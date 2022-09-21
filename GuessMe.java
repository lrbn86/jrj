import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int guessNumber = 0;
        int expectedNumber = 20;
        String message = "";

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");

        try {
            guessNumber = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a guess number.");
        }

        sc.close();

        if (guessNumber == expectedNumber) {
            message = "Wow, nice guess! That was it! It's " + guessNumber;
        } else if (guessNumber < expectedNumber) {
            message = guessNumber + "? Ha, nice try - too low! I chose " + expectedNumber;
        } else if (guessNumber > expectedNumber) {
            message = guessNumber + "? Too bad, way too high. I chose " + expectedNumber;
        }

        System.out.println(message);

    }
    
}
