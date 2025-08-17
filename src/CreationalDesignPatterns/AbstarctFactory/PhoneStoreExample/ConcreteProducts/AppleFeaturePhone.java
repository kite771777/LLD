package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.FeaturePhone;

public class AppleFeaturePhone implements FeaturePhone {
    public void call() {
        System.out.println("Calling from Apple Old Phone");
    }
}
