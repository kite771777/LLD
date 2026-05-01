package CreationalDesignPatterns.AbstarctFactory.AbstractFactoryBuiltOnSimpleFactory;

public class EconomyCarInterior implements CarInterior{

    @Override
    public void addComponent() {
        System.out.println("Adding Economy car interior!");
    }
}
