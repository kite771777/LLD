package StructuralDesignPattern.Proxy;

// Subject interface - common interface for RealSubject and Proxy
public interface EmployeeDao {
    void getEmployeeInfo(int empID);
    void createEmployee(EmployeeDo obj);
}
