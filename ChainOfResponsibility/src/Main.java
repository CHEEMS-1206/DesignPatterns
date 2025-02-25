import com.designPatterns.concreteHandlers.MinLengthVerify;
import com.designPatterns.concreteHandlers.MaxLengthVerify;
import com.designPatterns.handler.PasswordVerifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create validation handlers
        MinLengthVerify minLengthValidator = new MinLengthVerify(8); // Min length 8
        MaxLengthVerify maxLengthValidator = new MaxLengthVerify(16); // Max length 16

        // Set up the chain
        minLengthValidator.setNextVerifier(maxLengthValidator);

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your password:");
        String password = scanner.nextLine();

        // Validate password
        if (minLengthValidator.verify(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid. Please try again.");
        }

        scanner.close();
    }
}
