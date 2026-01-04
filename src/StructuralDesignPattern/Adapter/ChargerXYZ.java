package StructuralDesignPattern.Adapter;

public class ChargerXYZ implements IphoneCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your Iphone is charging...");
    }
}
