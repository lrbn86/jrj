import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {

        // declare variable to hold number of windows
        int numWindows = 0;
        
        // declare variables for height and width
        float height = 0f, width = 0f;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight = "", stringWidth = "";

        // declare other variables
        float areaOfWindow = 0f, perimeterOfWindow = 0f, totalCost = 0f, windowCost = 0f, trimCost = 0f;

        // declare and initialize the Scanner
        Scanner sc = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = sc.nextLine();
        try {
            height = Float.parseFloat(stringHeight);
        } catch (NumberFormatException e) {
            System.out.println("The height must be a number");
        }

        System.out.println("Please enter window width:");
        stringWidth = sc.nextLine();
        try {
            width = Float.parseFloat(stringWidth);
        } catch (NumberFormatException e) {
            System.out.println("The width must be a number");
        }

        System.out.println("Please enter the cost for window:");

        try {
            windowCost = Float.parseFloat(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The window cost must be a number");
        }

        System.out.println("Please enter the cost for trim:");
        try {
            trimCost = Float.parseFloat(sc.nextLine());
        } catch(NumberFormatException e) {
            System.out.println("The trim cost must be a number");
        }

        System.out.println("Please enter the number of windows:");
        try {
            numWindows = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The number of windows must be a number");
        }

        // Close input stream
        sc.close();

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        totalCost = numWindows * ((windowCost * areaOfWindow) + (trimCost * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + totalCost);

    }
    
}
