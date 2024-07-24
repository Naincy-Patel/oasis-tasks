
import java.util.Scanner;

public class OnlineReservationSystem1 {
    static Scanner scanner = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static String username = "";
    static String password = "";

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Online Reservation System!");
            System.out.println("1. Login");
            System.out.println("2. Reservation Form");
            System.out.println("3. Cancellation Form");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 



            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    if (isLoggedIn) {
                        reservationForm();
                    } else {
                        System.out.println("Please login first to access the Reservation Form.");
                    }
                    break;
                case 3:
                    if (isLoggedIn) {
                        cancellationForm();
                    }
                     else {
                        System.out.println("Please login first to access the Cancellation Form.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Online Reservation System. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void login() {
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Check credentials (simple check for demonstration)
        if (inputUsername.equals("user123") && inputPassword.equals("password123")) {
            isLoggedIn = true;
            username = inputUsername;
            password = inputPassword;
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }

    public static void reservationForm() {
        System.out.println("Reservation Form - Fill in the necessary details:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter source (from): ");
        String source = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.println("Reservation successful for " + name + " on train number " + trainNumber + " in " + classType + " class from " + source + " to " + destination + " on " + dateOfJourney);
    }

    public static void cancellationForm() {
        System.out.println("Cancellation Form - Enter PNR number for cancellation:");
        String pnrNumber = scanner.nextLine();

        // Retrieve information from the central database based on PNR number 
        System.out.println("Details for PNR number " + pnrNumber + " retrieved. Press OK to confirm cancellation.");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("OK")) {
            // Perform cancellation 
            System.out.println("Ticket with PNR number " + pnrNumber + " successfully cancelled.");
        } 
        else
         {
            System.out.print("cancellation process cancelled.");
         }
    }
}
 
