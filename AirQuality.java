import java.util.Scanner;
/**
* Program gives you the air quality
* with the number from the user.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-03-14
*/

public final class AirQuality {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private AirQuality() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */

    public static void main(String[] args) {

        // Constants, variables and counter
        String userNum = "";
        int userNumInt = 0;

        // Start counter
        int counter = 0;

        // Using Scanner for getting input from user
        final Scanner scanner = new Scanner(System.in);

        do {
            // Get user input for number and print intro
            System.out.println("Welcome, lets measure your air quality");

            System.out.println("Enter a number for to get your air quality: ");
            userNum = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to integer
                userNumInt = Integer.parseInt(userNum);

                // User guesses add to counter
                counter = counter + 1;

                if (userNumInt >= 0 && userNumInt <= 50) {
                    // if Air quality is good
                    System.out.println("Your air quality is good.");
                    System.out.println();

                } else if (userNumInt >= 51 && userNumInt <= 100) {
                    // if Air quality is moderate
                    System.out.println("Your air quality is Acceptable.");
                    System.out.println();

                } else if (userNumInt >= 101 && userNumInt <= 150) {
                    // if Air quality is unhealthy for groups
                    System.out.println("Your air quality is unhealthy ");
                    System.out.println("for certain groups.");
                    System.out.println();

                } else if (userNumInt >= 151 && userNumInt <= 200) {
                    // if Air quality is unhealthy
                    System.out.println("Your air quality is unhealthy.");
                    System.out.println();

                } else if (userNumInt >= 201 && userNumInt <= 300) {
                    // if Air quality is very unhealthy
                    System.out.print("Your air quality is very ");
                    System.out.println("unhealthy. Health Alert.");
                    System.out.println();

                } else if (userNumInt >= 301 && userNumInt <= 500) {
                    // if Air quality is very Hazardous
                    System.out.print("Emergency conditions. ");
                    System.out.println("Air is hazardous.");
                    System.out.println();
                }

            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.println("Please enter valid input."
                    + error.getMessage());
            }

        // When the number is out of range
        } while (userNumInt >= 0 && userNumInt <= 500);
        System.out.println("Your number is out of range");
        System.out.println("And you asked " + counter + " time(s)");

        // Close scanner
        scanner.close();
    }
}
