// Step 1: Create Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class TestCustomException {

    // Step 2: Method that throws custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("You are eligible!");
    }

    public static void main(String[] args) {

        try {
            // Step 3: Call method and handle custom exception
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught:");
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
