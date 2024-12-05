package singletonDesignPattern.singleton;

// Singleton class
public class Singleton {

    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        // Optional: Initialization code
    }

    // Step 3: Public static method to provide global access to the instance
    public static Singleton getInstance() {
        // Step 4: Create the instance if it doesn't exist (Lazy Initialization)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Some method for demonstration
    public void showMessage() {
        System.out.println("Hello from the Singleton!");
    }
}

