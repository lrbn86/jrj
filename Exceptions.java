import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        String input;

        double quotient = 0;
        int numerator = 0;
        int denominator = 0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter the numerator:");
            input = sc.nextLine();
            numerator = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("numerator: Input could not be parsed into an integer.");
        }

        try {
            System.out.println("Please enter the denominator:");
            input = sc.nextLine();
            denominator = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("denominator: Input could not be parsed into an integer.");
        }
        
        try {
            quotient = (double) (numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e);
        }
        
        System.out.println("The quotient is: " + quotient);
        
        sc.close();
    }
    
}
