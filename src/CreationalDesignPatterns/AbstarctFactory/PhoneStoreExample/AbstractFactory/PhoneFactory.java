package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.AbstractFactory;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.FeaturePhone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.Smartphone;

public interface PhoneFactory {
    Smartphone createSmartphone();
    FeaturePhone createFeaturePhone();
}