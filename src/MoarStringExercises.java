import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class MoarStringExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str1 = input.nextLine();
        System.out.println("Enter a second string:");
        String str2 = input.nextLine();

        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("They do be the same doh.");
        } else {
            System.out.println("Cool, they not the same, but cool cool cool.");
        }

        // System.out.flush();

        System.out.println("=================================");


        boolean isPassMatch = false;

        while (!isPassMatch) {

            System.out.println("Please enter a password:");
            String pass = input.nextLine();
            System.out.println("Please re-enter the password:");
            String passVerify = input.nextLine();

            if (pass.equals(passVerify)) {
                System.out.println("Passwords match, congrats.");
                isPassMatch = true;
            } else {
                System.out.println("Easy there turbo fingers, passwords don't match, try again:");
            }
        }

        System.out.println("=================================");
        System.out.println("Please create a username.");
        System.out.println("Must be at least 8 characters");
        System.out.println("Must contain the word \"code\"");

        boolean isNameValid = false;

        while (!isNameValid) {
            String userName = input.nextLine();
            if (userName.length() > 7 && userName.toLowerCase().contains("code")) {
                System.out.println("Success, welcome " + userName + "!");
                isNameValid = true;
            } else {
                System.out.println("Try again");
            }
        }
    }
}
