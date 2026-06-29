package BehavioralDesignPatterns.ChainofResponsibility;

// --- TESTING THE CODE (Client) ---
public class Main {
    public static void main(String[] args) {
        // 1. Chain setup karna (Usually application startup pe hota hai)
        RequestHandler auth = new AuthenticationHandler();
        RequestHandler role = new AuthorizationHandler();
        RequestHandler validation = new ValidationHandler();

        // auth -> role -> validation
        auth.setNextHandler(role);
        role.setNextHandler(validation);

        // 2. Testing with different requests
        System.out.println("--- Request 1 ---");
        boolean result1 = auth.handle("TOKEN_123, USER_ROLE, VALID_DATA"); // Fails at Role

        System.out.println("\n--- Request 2 ---");
        boolean result2 = auth.handle("TOKEN_123, ADMIN, VALID_DATA"); // Passes everything!

        if (result2) {
            System.out.println("🎉 Request finally reached the Controller!");
        }
    }
}