package singletonDesignPattern.threadSafeSingletons;

// EagerSingleton class using eager initialization
public class EagerSingleton {

    // Step 1: Create the instance at the time of class loading
    // This instance is created eagerly (during class loading)
    private static final EagerSingleton instance = new EagerSingleton();

    // Step 2: Private constructor to prevent external instantiation
    private EagerSingleton() {
        // Initialization code (if any)
    }

    // Step 3: Public static method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance; // Return the pre-created instance
    }

    // Some example method
    public void showMessage() {
        System.out.println("Hello from EagerSingleton!");
    }
}

// Client code to test EagerSingleton
//public class SingletonExample {
//    public static void main(String[] args) {
//        // Accessing the singleton instance
//        EagerSingleton singleton = EagerSingleton.getInstance();
//        singleton.showMessage();
//
//        // Checking if the same instance is returned on subsequent calls
//        EagerSingleton anotherSingleton = EagerSingleton.getInstance();
//        System.out.println(singleton == anotherSingleton); // Should print true
//    }
//}

