package Problems.VendingMachine_v2;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Item coke = new Item("101", "COKE", 60);
        Item pepsi = new Item("102", "PEPSI", 50);

        machine.addStock(coke, 5);
        machine.addStock(pepsi, 5);

        System.out.println("----- TEST SCENARIO 1: Happy Path -----");
        machine.insertCoin(Coin.TEN);      // Moves to HasMoneyState
        machine.insertCoin(Coin.HUNDRED);  // Balance: 110
        machine.selectItem("101");         // Select Coke (Price: 60), Moves to ItemSelectedState
        machine.dispense();                // Dispenses Coke, returns 50 Rs change, Moves back to IdleState

        System.out.println("\n----- TEST SCENARIO 2: Insufficient Funds -----");
        machine.insertCoin(Coin.TEN);
        machine.insertCoin(Coin.TEN);      // Balance: 20
        machine.selectItem("102");         // Select Pepsi (Price: 50)
        machine.dispense();                // Fails, auto-refunds 20 Rs

        System.out.println("\n----- TEST SCENARIO 3: Invalid Action (Dispensing while Idle) -----");
        machine.dispense();                // Should show error message
    }
}
