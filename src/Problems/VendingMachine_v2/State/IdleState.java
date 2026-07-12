package Problems.VendingMachine_v2.State;

import Problems.VendingMachine_v2.Coin;
import Problems.VendingMachine_v2.VendingMachine;

public class IdleState extends State {

    public IdleState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Coin inserted: " + coin.getValue() + " Rs.");
        machine.addCoinToBalance(coin);
        machine.setState(new HasMoneyState(machine));
    }
}
