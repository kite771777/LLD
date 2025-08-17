package CreationalDesignPatterns.AbstarctFactory;

public class WebDeveloper implements Employee{
    public int salary(){
        return 100000;
    }
    public String name(){
        System.out.println("I am web developer");
        return "webDeveloper";
    }
}
