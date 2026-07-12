package Problems.VendingMachine_v2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
   private final Inventory inventory;
   private final List<Coin> currentTransactionCoins;
   private String selectedItemCode;

    public VendingMachine() {
        this.inventory = new Inventory();
        this.currentTransactionCoins = new ArrayList<>();
    }
    public void addStock(String code,String name,Item item,int quantity){
        Item item=new Item(code,name,quantity);
        inventory.addStock(code,item,quantity);
    }
    public Inventory getInventory(){
        return inventory;
    }
    public void insertCoin(Coin coin) {
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

}
