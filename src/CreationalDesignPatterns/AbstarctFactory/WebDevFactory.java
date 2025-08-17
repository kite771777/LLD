package CreationalDesignPatterns.AbstarctFactory;

public class WebDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}
