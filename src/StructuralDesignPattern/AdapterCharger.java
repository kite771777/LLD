package StructuralDesignPattern;

public class AdapterCharger implements IphoneCharger{
    private final AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger){
        this.charger=charger;
    }
    @Override
    public void chargePhone(){
        charger.chargeAndroidPhone();
        System.out.println("Phone is charging using adapter..");
    }
}
