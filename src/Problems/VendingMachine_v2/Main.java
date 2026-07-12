package Problems.VendingMachine_v2;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Item item1=new Item("101","COKE",100);
        Item item2=new Item("102","PEPSI",100);
        Item item3=new Item("103","SODA",100);
        Item item4=new Item("104","WATER",100);
        vendingMachine.addStock("101","COKE",item1,10);
        vendingMachine.addStock("102","PEPSI",item2,10);
        vendingMachine.addStock("103","SODA",item3,10);
        vendingMachine.addStock("104","WATER",item4,10);



    }
}
