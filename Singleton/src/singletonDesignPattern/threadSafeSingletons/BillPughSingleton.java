package singletonDesignPattern.threadSafeSingletons;

// BillPughSingleton class using static inner class
public class BillPughSingleton {

    // Step 1: Private constructor to prevent instantiation from outside
    private BillPughSingleton() {
        // Initialization code (if any)
    }

    // Step 2: Static inner class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // This field is initialized only when this class is referenced
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    // Step 3: Public static method to return the Singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance; // Access instance through the inner class
    }

    // Some example method
    public void showMessage() {
        System.out.println("Hello from BillPughSingleton!");
    }
}

// Client code to test BillPughSingleton
//public class SingletonExample {
//    public static void main(String[] args) {
//        // Accessing the singleton instance
//        BillPughSingleton singleton = BillPughSingleton.getInstance();
//        singleton.showMessage();
//
//        // Checking if the same instance is returned on subsequent calls
//        BillPughSingleton anotherSingleton = BillPughSingleton.getInstance();
//        System.out.println(singleton == anotherSingleton); // Should print true
//    }
//}

