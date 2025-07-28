package CreationalDesignPatterns.Singleton;

public class Singleton {
    private static Singleton instance;

    // 1. Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // 2. Public static method to provide access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }
}
