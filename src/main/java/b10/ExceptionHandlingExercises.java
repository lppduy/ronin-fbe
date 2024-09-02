package b10;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this transaction.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class ExceptionHandlingExercises {

    public static void main(String[] args) {
        ExceptionHandlingExercises exercises = new ExceptionHandlingExercises();

        // Call methods to demonstrate each exercise.
        exercises.bai1();
        exercises.bai2();
        exercises.bai3();
        exercises.bai4();
        exercises.bai5();
        exercises.bai6();
        exercises.bai7();
        exercises.bai8();
        exercises.bai9();
        exercises.bai10();
    }

    public void bai1() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public void bai2() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public void bai3() {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            System.out.print("Enter first integer: ");
            a = scanner.nextInt();
            System.out.print("Enter second integer: ");
            b = scanner.nextInt();
            int result = a + b;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format.");
        } finally {
            System.out.println("This message is printed regardless of an exception.");
        }
    }

    public void bai4() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        try {
            System.out.print("Enter an index to update (0-4): ");
            int index = scanner.nextInt();
            System.out.print("Enter a value to assign: ");
            int value = scanner.nextInt();
            array[index] = value;
            System.out.println("Updated array element: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format.");
        }
    }

    public void bai5() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
            System.out.println("Age accepted.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void bai6() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new NumberFormatException("Negative numbers are not allowed.");
            }
            System.out.println("Number accepted: " + number);
        } catch (NumberFormatException e) {
            try {
                throw new NegativeNumberException("Error: Negative number detected.");
            } catch (NegativeNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void bai7() {
        try (Scanner fileScanner = new Scanner(new File("example.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

    public void bai8() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number to calculate its square root: ");
            double number = scanner.nextDouble();
            System.out.println("Square root: " + calculateSquareRoot(number));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double calculateSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public void bai9() {
        BankAccount account = new BankAccount(500.00);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void bai10() {
        ArrayList<String> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display students");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    studentList.add(name);
                    break;
                case 2:
                    System.out.print("Enter student index to remove: ");
                    int index = scanner.nextInt();
                    studentList.remove(index);
                    break;
                case 3:
                    if (studentList.isEmpty()) {
                        throw new NullPointerException("The student list is empty.");
                    }
                    System.out.println("Student List: " + studentList);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format.");
        }
    }
}
