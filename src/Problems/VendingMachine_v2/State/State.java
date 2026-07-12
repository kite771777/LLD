package Problems.VendingMachine_v2.State;


import Problems.VendingMachine_v2.Coin;
import Problems.VendingMachine_v2.VendingMachine;

public abstract class State {
    VendingMachine machine;
    State(VendingMachine machine){
       this.machine=machine;
    }
    public abstract void insertCoin(Coin coin);
    public abstract void selectItem(String code);
    public abstract void dispense();
    public abstract void refund();
}
