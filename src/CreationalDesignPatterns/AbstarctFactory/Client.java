package CreationalDesignPatterns.AbstarctFactory;

public class Client {
    public static void main(String[] args) {
        Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();
    }
}
