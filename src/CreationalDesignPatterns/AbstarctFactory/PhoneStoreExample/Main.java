package CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample;

import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.AbstractFactory.PhoneFactory;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ClientPhoneStore.PhoneStore;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteFactories.AppleFactory;
import CreationalDesignPatterns.AbstarctFactory.PhoneStoreExample.ConcreteFactories.SamsungFactory;

public class Main {
    public static void main(String[] args) {
        // Choose brand dynamically
        PhoneFactory factory;

        String brand = "Apple"; // This can come from config/user input

        if (brand.equalsIgnoreCase("Apple")) {
            factory = new AppleFactory();
        } else {
            factory = new SamsungFactory();
        }

        PhoneStore store = new PhoneStore(factory);
        store.showPhones();
    }
}

