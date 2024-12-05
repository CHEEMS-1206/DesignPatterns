package singletonDesignPattern.threadSafeSingletons;

public class Singleton {

    // Step 1: Use volatile to ensure the instance is visible across threads
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() { }

    // Synchronized method to ensure thread safety
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Some method for demonstration
    public void showMessage() {
        System.out.println("Hello from the thread-safe Singleton!");
    }
}

