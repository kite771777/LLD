package Problems.VendingMachine_v2.State;

import Problems.VendingMachine_v2.Item;
import Problems.VendingMachine_v2.VendingMachine;

public class ItemSelectedState extends State{
    ItemSelectedState(VendingMachine machine){
        super(machine);
    }
    @Override
    public void refund() {
        System.out.println("Transaction cancelled. Returning: " + machine.getCurrentBalance() + " Rs.");
        machine.getCurrentTransactionCoins().clear();
        machine.setState(new IdleState(machine));
    }
    @Override
    public void dispense(){
        String code= machine.getSelectedItemCode();
        Item item=machine.getInventory().getItem(code);
        int price= item.getPrice();
        int balance=machine.getCurrentBalance();

        if(balance<price){
            System.out.println("Insufficient amount! Product price is: " + price + " Rs, but you inserted: " + balance + " Rs.");
            System.out.println("Auto-refunding your amount...");
            machine.getCurrentTransactionCoins().clear();
            machine.setSelectedItemCode(null);
            machine.setState(new IdleState(machine));
        }
        else {
            System.out.println("Dispensing item: " + item.getName());
            machine.getInventory().reduceStock(code);

            int change = balance - price;
            if (change > 0) {
                System.out.println("Please collect your change: " + change + " Rs.");
            }

            machine.getCurrentTransactionCoins().clear();
            machine.setSelectedItemCode(null);
            machine.setState(new IdleState(machine));
        }
    }
}
