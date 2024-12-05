package singletonDesignPattern.threadSafeSingletons;

// DoubleCheckedLockingSingleton class for efficient thread-safe singleton
public class DoubleCheckedLockingSingleton {

    // Step 1: Use volatile to ensure visibility across threads
    private static volatile DoubleCheckedLockingSingleton instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private DoubleCheckedLockingSingleton() {
        // Initialization code (if any)
    }

    // Step 3: Public static method to return the Singleton instance
    public static DoubleCheckedLockingSingleton getInstance() {
        // First check (no synchronization needed)
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Second check (synchronized block to prevent race conditions)
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton(); // Create instance
                }
            }
        }
        return instance; // Return the instance
    }

    // Some example method
    public void showMessage() {
        System.out.println("Hello from DoubleCheckedLockingSingleton!");
    }
}

// Client code to test DoubleCheckedLockingSingleton
//public class SingletonExample {
//    public static void main(String[] args) {
//        // Accessing the singleton instance
//        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
//        singleton.showMessage();
//
//        // Checking if the same instance is returned on subsequent calls
//        DoubleCheckedLockingSingleton anotherSingleton = DoubleCheckedLockingSingleton.getInstance();
//        System.out.println(singleton == anotherSingleton); // Should print true
//    }
//}

