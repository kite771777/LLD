package Solid.SingleResponsibilityPrinciple;

public class UserRepository {
    public void save(String username, String password) {
        System.out.println("Saving user to DB: " + username);
    }
}
