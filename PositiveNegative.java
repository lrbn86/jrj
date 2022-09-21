import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        int number = 0;
        String stringValue = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        stringValue = sc.nextLine();
        sc.close();
        number = Integer.parseInt(stringValue);

        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }
    
}
