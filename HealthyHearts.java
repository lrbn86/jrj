import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int age, maxHeartRate, startHRZ, endHRZ;

        System.out.print("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());
        inputReader.close();
        maxHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        startHRZ = (int)Math.ceil(maxHeartRate * 0.5);
        endHRZ = (int)Math.ceil(maxHeartRate * 0.85);
        System.out.println("Your target HR Zone is " + startHRZ + " - " + endHRZ + " beats per minute");

    }
    
}
