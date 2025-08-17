package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteFactories;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.AbstractFactory.PhoneFactory;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts.AppleFeaturePhone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts.AppleSmartphone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.FeaturePhone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.Smartphone;

public class AppleFactory implements PhoneFactory {
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    public FeaturePhone createFeaturePhone() {
        return new AppleFeaturePhone();
    }
}
