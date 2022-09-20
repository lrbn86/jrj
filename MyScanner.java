import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        // declare the number variables and initialize to 0
        String name = "";
        int age = 0;
        // int numComputers = 0;
        // String hometown = "";

        // declare and initialize a Scanner object - the Scanner reads
        // input from the console
        Scanner myScanner = new Scanner(System.in);

        // ask the user to input their name
        System.out.println("Please enter your name:");

        // now wait until the user types something in - put the value
        // in name
        name = myScanner.nextLine();

        // ask the user to input their age:
        System.out.println("Please enter your age:");
        // now wait until the user types their age
        age = myScanner.nextInt();

        // print the information to the console
        System.out.println("Hi " + name + " your age is " + age);
        
    }
    
}
