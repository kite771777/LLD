package Solid.SingleResponsibilityPrinciple;

public class UserValidator {
    public boolean isValid(String username, String password) {
        return username != null && password.length() >= 6;
    }
}
