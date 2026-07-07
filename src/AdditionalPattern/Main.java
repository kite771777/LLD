package AdditionalPattern;

public class Main {
    public static void main(String[] args) {

        // Scenario 1: Logging Enabled
        Logger activeLogger = LoggerFactory.getLogger(true);
        // Client ko null check karne ki zaroorat hi nahi!
        activeLogger.log("User created successfully.");
        // Output: 📝 LOG: User created successfully.

        // Scenario 2: Logging Disabled
        Logger dummyLogger = LoggerFactory.getLogger(false);
        // Yahan bina null check lagaye call kiya, par application nahi fati!
        dummyLogger.log("This will be ignored.");
        // Output: (Kuch print nahi hoga, completely silent)
    }
}
