package ObserverPattern;

import ObserverPattern.Observable.CookieObservableImpl;
import ObserverPattern.Observable.IPhoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;
import java.util.logging.Logger;

public class Store {
    private static final Logger logger = Logger.getLogger(Store.class.getName()); // Create Logger instance

    public static void main(String[] args){
        StocksObservable iPhoneObservable = new IPhoneObservableImpl();

        NotificationAlertObserver user1 = new EmailAlertObserverImpl("email@example.com", iPhoneObservable);
        NotificationAlertObserver user2 = new MobileAlertObserverImpl("1234567890", iPhoneObservable);
        iPhoneObservable.add(user1);
        iPhoneObservable.add(user2);
        iPhoneObservable.setStockCount(10);
        logger.info("Current iPhone stock count: " + iPhoneObservable.getStockCount()); // Logging instead of println


        StocksObservable cookieObservable = new CookieObservableImpl();
        NotificationAlertObserver user3 = new EmailAlertObserverImpl("email@example.com", cookieObservable);
        cookieObservable.add(user3);
        cookieObservable.setStockCount(5);
        logger.info("Current cookie stock count: " + cookieObservable.getStockCount()); // Logging instead of println
    }
}
