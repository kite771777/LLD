package Problems.VendingMachine_v2.State;

import Problems.VendingMachine_v2.Coin;
import Problems.VendingMachine_v2.VendingMachine;

public class HasMoneyState extends State{
    HasMoneyState(VendingMachine machine){
        super(machine);
    }
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Coin inserted: " + coin.getValue() + " Rs.");
        machine.addCoinToBalance(coin);
    }

    @Override
    public void selectItem(String code) {
        if (!machine.getInventory().checkAvailability(code)) {
            System.out.println("Item not available! Please try another code.");
        } else {
            machine.setSelectedItemCode(code);
            machine.setState(new ItemSelectedState(machine));
        }
    }

    @Override
    public void refund() {
        System.out.println("Transaction cancelled. Returning: " + machine.getCurrentBalance() + " Rs.");
        machine.getCurrentTransactionCoins().clear();
        machine.setState(new IdleState(machine));
    }
}
