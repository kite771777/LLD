package Solid.SingleResponsibilityPrinciple;

public class UserService {
    private final UserValidator validator = new UserValidator();
    private final UserRepository repository = new UserRepository();
    private final EmailService emailService = new EmailService();

    public void registerUser(String username, String password) {
        if (!validator.isValid(username, password)) {
            System.out.println("❌ Invalid input: Username can't be empty and password must be at least 6 characters.");
            return;
        }

        repository.save(username, password);
        emailService.sendWelcomeEmail(username);
        System.out.println("🎉 User registration completed!");
    }
}
