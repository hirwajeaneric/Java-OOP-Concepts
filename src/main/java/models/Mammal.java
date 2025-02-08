package models;

public class Mammal {
    String name;
    int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Generic mammal sound");
    }
}
