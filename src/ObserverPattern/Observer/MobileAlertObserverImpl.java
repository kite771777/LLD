package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobileNumber;
    StocksObservable observable;
    public MobileAlertObserverImpl(String mobileNumber, StocksObservable observable){
        this.mobileNumber=mobileNumber;
        this.observable=observable;
    }
    @Override
    public void update() {
        System.out.println("Mobile Alert: " +mobileNumber+ ":" + "product is in stock hurry up!!");
    }
}
