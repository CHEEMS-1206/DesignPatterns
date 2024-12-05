package singletonDesignPattern.clinet;

import singletonDesignPattern.singleton.Singleton;

// Client code to test Singleton
public class SingletonExample {
    public static void main(String[] args) {
        // Access the single instance of Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Check if two calls return the same instance
        Singleton anotherSingleton = Singleton.getInstance();
        singleton.showMessage();

        System.out.println(singleton == anotherSingleton); // Should print true
    }
}