package StructuralDesignPattern;

public class ChargerABC implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your Android phone is charging..");
    }
}
