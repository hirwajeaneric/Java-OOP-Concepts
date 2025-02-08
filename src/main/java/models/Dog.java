package models;

public class Dog extends Animal { // Concrete subclass
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() { // Implementing the abstract method
        System.out.println("Dog sound...");
    }
}
