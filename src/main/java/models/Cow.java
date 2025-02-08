package models;

public class Cow extends Mammal { // 'extends' keyword indicates inheritance
    String breed;

    public Cow(String name, int age, String breed) {
        super(name, age); // Calls the superclass constructor to initiate inheritance
        this.breed = breed;
    }

    public void moo() {
        System.out.println("Moo!");
    }
}