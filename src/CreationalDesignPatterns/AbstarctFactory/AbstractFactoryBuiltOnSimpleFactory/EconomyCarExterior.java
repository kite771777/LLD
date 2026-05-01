package CreationalDesignPatterns.AbstarctFactory.AbstractFactoryBuiltOnSimpleFactory;

public class EconomyCarExterior implements CarExterior{

    @Override
    public void addComponents() {
        System.out.println("Adding economy car exterior!");
    }
}
