package CreationalDesignPatterns.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception, CloneNotSupportedException{
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.hashCode());

        // Singleton obj2 = Singleton.getInstance();
        // System.out.println(obj2.hashCode());
        // System.out.println(obj1 == obj2);  // true (Same instance)

//        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton obj3=constructor.newInstance();
//        System.out.println(obj3.hashCode());


//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(obj1);
//        System.out.println("serialization done...");
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//        Singleton obj4=(Singleton) ois.readObject();
//        System.out.println(obj4.hashCode());


        Singleton obj5=(Singleton) obj1.clone();
        System.out.println(obj5.hashCode());
    }
}
/* BREAK SINGLETON
* 1. Reflection API to break singleton pattern
* solution: 1-> if object is there ==> throw exception from inside constructor
* solution: 2-> use enum (make Singleton class as enum
* 2. Deserialization
* solution: implementing readResolve method
* 3. Cloning
*
*/