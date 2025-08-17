package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.Smartphone;

public class AppleSmartphone implements Smartphone {
    public void call() {
        System.out.println("Calling from Apple iPhone");
    }
}
