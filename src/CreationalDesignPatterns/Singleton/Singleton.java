package CreationalDesignPatterns.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
    private static Singleton instance;
    // 1. Private constructor
    private Singleton() {
//        if(instance!=null) {
//            throw new RuntimeException("You are trying to to break singleton pattern");
//        }
    }

    // 2. Public static method to provide access
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // Lazy initialization
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();
        return instance;
    }
}
