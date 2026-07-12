package Problems.VendingMachine_v2;

import Problems.VendingMachine_v2.State.IdleState;
import Problems.VendingMachine_v2.State.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
   private final Inventory inventory;
   private final List<Coin> currentTransactionCoins;
   private String selectedItemCode;
    private State currentState;

    public VendingMachine() {
        this.inventory = new Inventory();
        this.currentTransactionCoins = new ArrayList<>();
        this.currentState = new IdleState(this);
    }
    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }
    public void selectItem(String code) {
        currentState.selectItem(code);
    }
    public void dispense() {
        currentState.dispense();
    }
    public void refund() {
        currentState.refund();
    }
    public void setState(State state) {
        this.currentState = state;
    }

    public void addCoinToBalance(Coin coin) {
        currentTransactionCoins.add(coin);
    }

    public List<Coin> getCurrentTransactionCoins() {
        return currentTransactionCoins;
    }

    public int getCurrentBalance() {
        int total = 0;
        for (Coin coin : currentTransactionCoins) {
            total += coin.getValue();
        }
        return total;
    }
    public void setSelectedItemCode(String code) {
        this.selectedItemCode = code;
    }

    public String getSelectedItemCode() {
        return selectedItemCode;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void addStock(Item item, int quantity) {
        inventory.addStock(item.getCode(), item, quantity);
    }
}
