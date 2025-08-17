package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteFactories;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.AbstractFactory.PhoneFactory;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts.SamsungFeaturePhone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteProducts.SamsungSmartphone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.FeaturePhone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.Smartphone;

public class SamsungFactory implements PhoneFactory {
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }

    public FeaturePhone createFeaturePhone() {
        return new SamsungFeaturePhone();
    }
}
