package BehavioralDesignPatterns.IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement=new UserManagement();
        userManagement.addUser(new User("ritik","101"));
        userManagement.addUser(new User("raj","102"));
        userManagement.addUser(new User("ss","103"));
        MyIterator myIterator=userManagement.getIterator();
        while(myIterator.hasNext()){
            User user=(User)myIterator.next();
            System.out.println(user.getName());
        }
    }
}
