package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ClientPhoneStore;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.AbstractFactory.PhoneFactory;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.FeaturePhone;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ProductInterfaces.Smartphone;

public class PhoneStore {
    private Smartphone smartphone;
    private FeaturePhone featurePhone;

    public PhoneStore(PhoneFactory factory) {
        smartphone = factory.createSmartphone();
        featurePhone = factory.createFeaturePhone();
    }

    public void showPhones() {
        smartphone.call();
        featurePhone.call();
    }
}
