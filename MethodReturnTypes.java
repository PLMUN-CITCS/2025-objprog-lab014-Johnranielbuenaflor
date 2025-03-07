// Define the class
public class MethodReturnTypes {

    // Main method
    public static void main(String[] args) {
        displayWelcomeMessage(); // Calling the void method

        int value1 = 20;  // First argument
        int value2 = 30;  // Second argument
        double result = calculateAverage(value1, value2); // Calling the method that returns a value

        System.out.println("The average is: " + result); // Print the result
    }

    // Void method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method that returns the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0; // Calculate the average
        return average; // Return the calculated average
    }
}
