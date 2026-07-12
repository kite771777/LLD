package Problems.VendingMachine_v2.State;


import Problems.VendingMachine_v2.Coin;
import Problems.VendingMachine_v2.VendingMachine;

public abstract class State {
    protected VendingMachine machine;

    public State(VendingMachine machine) {
        this.machine = machine;
    }

    // Default behavior throws exception to prevent invalid actions
    public void insertCoin(Coin coin) {
        System.out.println("ERROR: Action 'Insert Coin' is not allowed in current state.");
    }
    public void selectItem(String code) {
        System.out.println("ERROR: Action 'Select Item' is not allowed in current state.");
    }
    public void dispense() {
        System.out.println("ERROR: Action 'Dispense' is not allowed in current state.");
    }
    public void refund() {
        System.out.println("ERROR: Action 'Refund' is not allowed in current state.");
    }
}
