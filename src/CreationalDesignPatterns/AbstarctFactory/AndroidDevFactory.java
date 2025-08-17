package CreationalDesignPatterns.AbstarctFactory;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
