package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.FeaturePhone;

public class SamsungFeaturePhone implements FeaturePhone {
    public void call() {
        System.out.println("Calling from Samsung Guru");
    }
}