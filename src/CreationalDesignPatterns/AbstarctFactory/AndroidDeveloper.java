package CreationalDesignPatterns.AbstarctFactory;

public class AndroidDeveloper implements Employee{
    public int salary(){
        return 500000;
    }
    public String name(){
        System.out.println("I am android developer");
        return "androidDeveloper";
    }
}
