package models;

abstract class Animal { // Abstract class
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); // Abstract method (no body)

    public void eat() { // Concrete method
        System.out.println("Eating...");
    }
}

class Cat extends Animal { // Another concrete subclass
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() { // Implementing the abstract method
        System.out.println("Meow!");
    }
}

