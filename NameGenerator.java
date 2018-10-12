package starwarsgenerator;

import java.util.Scanner;

/**
 * @author 14001835
 */
public class NameGenerator {

    private String firstName;
    private String lastName;
    private String maidenName;
    private String placeOfBirth;

    public NameGenerator() {
        Scanner kboard = new Scanner(System.in);
        //First Name
        String choice = "";
        System.out.println("Please enter your first name: ");
        choice = kboard.next();
        firstName = choice;
        //Last Name
        choice = "";
        System.out.println("Please enter your last name: ");
        choice = kboard.next();
        lastName = choice;
        //Maiden Name
        choice = "";
        System.out.println("Please enter your mother's maiden name: ");
        choice = kboard.next();
        maidenName = choice;
        //Place of Birth
        choice = "";
        System.out.println("Please enter your place of birth: ");
        choice = kboard.next();
        placeOfBirth = choice;

    }

    public String generateStarWarsName() {
        String starWarsName = lastName.substring(0, 3) + firstName.substring(0, 2) + " " + maidenName.substring(0, 2) + placeOfBirth.substring(0, 3);
        return starWarsName;
    }

    public void displayStarWarsName() {
        String generatedName = generateStarWarsName();
        System.out.println("Your Star Wars name is:");
        System.out.println(generatedName.toLowerCase());
    }

}
