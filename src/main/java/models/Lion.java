package models;

public class Lion extends Mammal {
    String breed;

    public Lion(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void eat() {
        System.out.println("The Lion is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The Lion is sleeping");
    }
}
