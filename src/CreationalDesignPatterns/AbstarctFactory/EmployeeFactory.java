package CreationalDesignPatterns.AbstarctFactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
