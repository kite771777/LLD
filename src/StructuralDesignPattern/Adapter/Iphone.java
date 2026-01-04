package StructuralDesignPattern.Adapter;

public class Iphone {
    private final IphoneCharger  iphoneCharger;

    public Iphone(IphoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }

    public void chargeIphone(){
        iphoneCharger.chargePhone();
    }
}
