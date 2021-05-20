import java.util.Scanner;

public class NameRiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = input.nextLine();

        if (firstName.length() > lastName.length()) {
            System.out.println("Thank you " + firstName + " " + lastName + "!");
            System.out.println("Your first name is longer than your last name.");
        } else if (firstName.length() < lastName.length()) {
            System.out.println("Thank you " + firstName + " " + lastName + "!");
            System.out.println("Your last name is longer than your first name.");
        } else {
            System.out.println("Thank you " + firstName + " " + lastName + "!");
            System.out.println("Your first name and last name are the same length.");
        }
        System.out.println("----------------------------------------------");
        System.out.println("Time for a riddle!");
        System.out.println("If you drop a yellow hat in the Red Sea, what does it become?");

        boolean isRiddleSolved = false;

        while (!isRiddleSolved) {

            String answer = input.nextLine();

            if (answer.toLowerCase().equals("wet")) {
                System.out.println("Correct! The hat becomes wet.");
                isRiddleSolved = true;
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("Wrong! Let's try again.");
                System.out.println("If you drop a yellow hat in the Red Sea, what does it become?");
            }
        }
    }
}
