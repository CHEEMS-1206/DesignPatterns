package singletonDesignPattern.threadSafeSingletons;

// LazySingleton class using synchronized method
public class LazySingleton {

    // Step 1: Declare the static instance variable
    private static LazySingleton instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private LazySingleton() {
        // Initialization code (if any)
    }

    // Step 3: Public static method to return the Singleton instance
    // Synchronized method to ensure thread safety in a multi-threaded environment
    public static synchronized LazySingleton getInstance() {
        // Step 4: Initialize the instance only when needed (lazy initialization)
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance; // Return the instance
    }

    // Some example method
    public void showMessage() {
        System.out.println("Hello from LazySingleton!");
    }
}

// Client code to test LazySingleton
//public class SingletonExample {
//    public static void main(String[] args) {
//        // Accessing the singleton instance
//        LazySingleton singleton = LazySingleton.getInstance();
//        singleton.showMessage();
//
//        // Checking if the same instance is returned on subsequent calls
//        LazySingleton anotherSingleton = LazySingleton.getInstance();
//        System.out.println(singleton == anotherSingleton); // Should print true
//    }
//}

