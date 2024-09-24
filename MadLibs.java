import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for different parts of speech
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

        // Create the Mad Libs story using the user's input
        String story = "Today I went to the " + place + ". I saw a(n) " + adjective + " " + animal +
                " jumping up and down in excitement. It " + verb +
                " through the air and landed on a " + noun +
                ". Everyone was " + emotion + "!";

        // Print the final story
        System.out.println("\nHere is your Mad Libs story:");
        System.out.println(story);

        // Close the scanner
        scanner.close();

    }
}