public class AboutYou {

    public static void main(String[] args) {

        int age = 19;
        boolean registered = true;

        // see if a person can vote!
        if (age >= 18 && registered) {
            System.out.println("You can vote!");
        }

        // see if they are not allowed to vote!
        if (age < 18 || !registered) {
            System.out.println("You are not eligible to vote!");
        }
    }
    
}
