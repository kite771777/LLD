package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.Smartphone;

public class SamsungSmartphone implements Smartphone {
    public void call() {
        System.out.println("Calling from Samsung Galaxy");
    }
}
