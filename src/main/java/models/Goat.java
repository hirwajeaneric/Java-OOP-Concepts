package models;

public class Goat extends Mammal {
    String breed;

    public Goat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meeeh!");
    }

    @Override
    public void eat() {
        System.out.println("The goat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The goat is sleeping");
    }
}
