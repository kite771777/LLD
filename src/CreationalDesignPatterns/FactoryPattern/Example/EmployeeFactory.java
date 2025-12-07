package CreationalDesignPatterns.FactoryPattern.Example;

public class EmployeeFactory {
    public static Employee getEmployee(String emp){
        switch (emp){
            case "ANDROID":
                return new AndroidDeveloper();
            case "WEB":
                return new WebDeveloper();
            default:
                return null;
        }
    }
}
