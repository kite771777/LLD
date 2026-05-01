package CreationalDesignPatterns.AbstarctFactory.AbstractFactoryBuiltOnSimpleFactory;

public class LuxuryCarInterior implements CarInterior{
    @Override
    public void addComponent() {
        System.out.println("Adding luxury interior!");
    }
}
