package Problems.VendingMachine_v2;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static class ProductSlot {
        Item item;
        int quantity;

        ProductSlot(Item item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }
    }
    private final Map<String,ProductSlot> inventoryMap=new HashMap<>();

    public void addStock(String code,Item item,int quantity){
        if(inventoryMap.containsKey(code)){
            ProductSlot slot=inventoryMap.get(code);
            slot.quantity+=quantity;
        }
        else{
            inventoryMap.put(code,new ProductSlot(item,quantity));
        }
    }
    public void reduceStock(String code){
        if (checkAvailability(code)) {
            inventoryMap.get(code).quantity -= 1;
        }
    }

    public boolean checkAvailability(String code) {
        return inventoryMap.containsKey(code) && inventoryMap.get(code).quantity > 0;
    }
    public Item getItem(String code) {
        if (inventoryMap.containsKey(code)) {
            return inventoryMap.get(code).item;
        }
        return null;
    }
}
