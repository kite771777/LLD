package CreationalDesignPatterns.FactoryPattern.Example;


public class Main {
    public static void main(String[] args) {
        Employee emp=EmployeeFactory.getEmployee("WEB");
        System.out.println(emp.salary());
    }
}
