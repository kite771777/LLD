package Solid.LiskovSubstitutionPrinciple;

class Ostrich implements Bird {
    public void eat() {
        System.out.println("Ostrich eats");
    }

    // No fly() method – that’s okay!
}