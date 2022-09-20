import java.util.Scanner;

public class MiniMadLibs {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String noun1, noun2, adjective1, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, infinitiveVerb, pastParticipleVerb;
        int number;

        System.out.print("I need a noun: ");
        noun1 = sc.nextLine();
        System.out.print("Now an adjective: ");
        adjective1 = sc.nextLine();
        System.out.print("Another noun: ");
        noun2 = sc.nextLine();
        System.out.print("And a number: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("Another adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("A plural noun: ");
        pluralNoun1 = sc.nextLine();
        System.out.print("Another one: ");
        pluralNoun2 = sc.nextLine();
        System.out.print("One more: ");
        pluralNoun3 = sc.nextLine();
        System.out.print("A verb (infinitive form): ");
        infinitiveVerb = sc.nextLine();
        System.out.print("Same verb (past participle): ");
        pastParticipleVerb = sc.nextLine();

        System.out.println("\n*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ".");
        System.out.println("Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " + adjective2 + " " + pluralNoun2);
        System.out.println("and " + adjective2 + " " + pluralNoun3 + ", to boldly " + infinitiveVerb + " where no one has " + pastParticipleVerb + " before.");

        sc.close();

    }
    
}
