package Solid.LiskovSubstitutionPrinciple;

class Sparrow implements Bird, Flyable {
    public void eat() {
        System.out.println("Sparrow eats");
    }

    public void fly() {
        System.out.println("Sparrow flies");
    }
}
