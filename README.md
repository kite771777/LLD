LLD
Design Patterns
Github:-https://github.com/kite771777/LLD/tree/main/src
➤ A. Creational Design Patterns
Singleton
- The Singleton Pattern ensures that a class has only one instance and provides a global access point to that instance.
  `public class Singleton {
  private static Singleton instance;
  // 1. Private constructor
  private Singleton() {
  System.out.println("Singleton instance created");
  }

  // 2. Public static method to provide access
  public static Singleton getInstance() {
  if (instance == null) {
  instance = new Singleton(); // Lazy initialization
  }
  }
  return instance;
  }
  }`
- Real-World Analogy
  Think of a Government. There can only be one Prime Minister at a time. No matter where you are in the country, if you ask for the Prime Minister, you should get the same person.
- When to Use
    * Database connection pool
    * Logger class
    * Configuration manager
- Key Characteristics
    * Single instance throughout the program.
    * Lazy initialization (often used).
    * Thread safety (in multi-threaded environments).
      `public static Singleton getInstance() {
      if (instance == null) {
      synchronized (Singleton.class) {
      if (instance == null) {
      instance = new Singleton(); // Lazy initialization
      }
      }
      }
      return instance;
      }`
    * Global point of access.
- Benefits
    * Controlled access to a single instance.
    * Reduces memory usage (no duplicate objects).
    * Useful for shared resources (e.g., loggers, DB).


Factory
- The Factory Pattern provides an interface for creating objects without exposing the creation logic to the client and refers to the newly created object using a common interface.
- Real-World Analogy
  Imagine a Shape Factory: You request a shape, and it gives you a Circle or a Rectangle based on your input, without you knowing how it's created.
- When to Use
    * You have multiple subclasses implementing a common interface.
    * You want to centralize object creation.
    * You want to decouple object creation from business logic.
- Benefits
    * Loose Coupling: Client doesn't need to know which class is being instantiated.
    * Encapsulation: Creation logic is separated.
    * Scalability: Easily add new shapes or types without modifying client code.
- Code
1. Shape Interface

`public interface Shape {
void draw();
}`

2. Concrete Implementations

`public class Circle implements Shape {
public void draw() {
System.out.println("Drawing a Circle");
}
}

public class Rectangle implements Shape {
public void draw() {
System.out.println("Drawing a Rectangle");
}
}

public class Square implements Shape {
public void draw() {
System.out.println("Drawing a Square");
}
}`

3. Factory Class

`public class ShapeFactory {
public Shape getShape(String shapeType) {
if (shapeType == null) return null;

        switch (shapeType.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "square": return new Square();
            default: return null;
        }
    }
}`

4. Client Code (Main Class)

`public class Main {
public static void main(String[] args) {
ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        shape1.draw();  // Output: Drawing a Circle

        Shape shape2 = factory.getShape("rectangle");
        shape2.draw();  // Output: Drawing a Rectangle

        Shape shape3 = factory.getShape("square");
        shape3.draw();  // Output: Drawing a Square
    }
}`

Abstract Factory

* Builder
* Prototype
  ➤ B. Structural Design Patterns
* Adapter
* Decorator
* Composite
* Proxy
* Flyweight
* Bridge
* Facade
  ➤ C. Behavioral Design Patterns
* Strategy
* Observer
* Command
* State
* Template Method
* Chain of Responsibility








