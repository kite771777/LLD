package CreationalDesignPatterns.FactoryPattern.Example;

public class AndroidDeveloper implements Employee{
    public int salary(){
        System.out.println("Getting android developer salary....");
        return 100;
    }
}
