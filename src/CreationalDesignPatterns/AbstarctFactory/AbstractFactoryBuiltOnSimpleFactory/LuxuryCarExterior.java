package CreationalDesignPatterns.AbstarctFactory.AbstractFactoryBuiltOnSimpleFactory;

public class LuxuryCarExterior implements CarExterior{
    @Override
    public void addComponents() {
        System.out.println("Adding luxury car exterior!");
    }
}
