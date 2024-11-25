package lecture10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        String filename = "src/com/example/auto-course/lecture10/number1.txt";
        calculateSquareRoot(filename);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an age to validate: ");
        int age = getValidIntegerInput();
        processUserAge(age);

        scanner.close();
    }

    public static int getValidIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter an integer: ");
            try {
                userInput = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }

        return userInput;
    }

    public static void calculateSquareRoot(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
            if (!scanner.hasNextInt()) {
                throw new InputMismatchException("File does not contain a valid integer.");
            }

            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Error: Age must be between 0 and 120.");
        }
    }

    public static void processUserAge(int age) {
        try {
            validateAge(age);
            System.out.println("The age " + age + " is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
