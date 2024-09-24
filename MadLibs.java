import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter an emotion: ");
        String emotion = scanner.nextLine();

        
        String story = "Today I went to the " + place + ". I saw a(n) " + adjective + " " + animal +
                " jumping up and down in excitement. It " + verb +
                " through the air and landed on a " + noun +
                ". Everyone was " + emotion + "!";

        
        System.out.println("\nHere is your Mad Libs story:");
        System.out.println(story);

        
        scanner.close();

    }
}
