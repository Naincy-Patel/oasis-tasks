import java.util.Scanner;

class OnlineExamSystem4 {
    static String username;
    static String password;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Login
        System.out.println("Welcome to the Online Examination System!");
        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        // Update Profile and Password
        System.out.print("Do you want to update your profile and password? (yes/no): ");
        String updateChoice = input.nextLine();
        if (updateChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter your new username: ");
            username = input.nextLine();
            System.out.print("Enter your new password: ");
            password = input.nextLine();
            System.out.println("Profile and password updated successfully!");
        }

        // MCQs
        System.out.println("Let's start the MCQs:");
        System.out.println("1. What is the capital of uttarpradesh?");
        System.out.println("a) Jaipur b) Lucknow c) Panaji d) Goa");
        String answer = input.nextLine();

        // Timer and Auto-Submit
        int timeLimit = 60; // 60 seconds
        System.out.println("You have " + timeLimit + " seconds to complete the MCQs.");
        try {
            Thread.sleep(timeLimit * 1000); // Convert seconds to milliseconds
            System.out.println("Time's up! Automatically submitting your answers...");
            submitAnswers(answer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Closing Session and Logout
        System.out.println("Session closed. Thank you for taking the exam, " + username + "!");
    }

    static void submitAnswers(String answer) {
        System.out.println("Answer submitted: " + answer);
    }
}


