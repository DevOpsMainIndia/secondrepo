import java.util.Scanner; // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        // 1. Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // 2. Print a message to the console
        System.out.println("Welcome to Java programming!");
        System.out.print("Please enter your name: ");
        
        // 3. Read a string from the user
        String name = scanner.nextLine();
        
        System.out.print("Enter your birth year: ");
        // 4. Read an integer from the user
        int birthYear = scanner.nextInt();
        
        // 5. Calculate age (Assuming current year is 2026)
        int currentYear = 2026;
        int age = currentYear - birthYear;
        
        // 6. Output result with conditions
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are turning " + age + " years old this year.");
        
        if (age >= 18) {
            System.out.println("Status: You are an adult.");
        } else {
            System.out.println("Status: You are a minor.");
        }
        
        // 7. Close the scanner resource
        scanner.close();
    }
}
