package com.eric;

import interfaces.Drawable;
import interfaces.IFlyable;
import interfaces.ISwimmable;
import models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello Practice!");
        Student eric = new Student("Hirwa", "Jean Eric", "hirwajeric@gmail.com", "Hirwa123", 4.5, 140);
        System.out.println(eric.setGpa(4.4));
        System.out.println(eric.getString());
        */

        /**
         * ENCAPSULATION: Protecting Your Data
         *
         * - Bundling data (fields) and methods that operate on that data within a class.
         * - Restricting direct access to some of an object's components (data hiding).
         * - Achieved using access modifiers (private, protected, public).
         * **************************************************************************
         */
        /*
        BankAccount ericAccount = new BankAccount();
        ericAccount.deposit(234.5);
        System.out.println("My balance is: "+ericAccount.getBalance());
        // System.out.println("My balance is: "+ericAccount.balance); // Without encapsulation
        */



        /**
         * ABSTRACTION
         * **************************************************************************
         */
        // 1. Abstract classes

        /*
        // Animal animal = new Animal("Generic animal"); //Can not create object of abstract class
        Dog mydog = new Dog("Labrador");
        mydog.makeSound();
        mydog.eat();
        */


        // 2. Interfaces
//        Bird myBird = new Bird();
//        myBird.fly("Owl");
//        myBird.swim();
//
//        IFlyable f = myBird; // Using the interface type
//        f.fly("Eagle");
//
//        ISwimmable s = myBird; // Using the other interface type
//        s.swim();

        /**
         * INHERITANCE
         * **************************************************************************
         */
//        Cow myCow = new Cow("Buddy", 3, "Friesian");
//        myCow.eat();
//        myCow.moo();
//
//        Mammal human = new Mammal("John", 20);
//        human.eat();
//        human.sleep();


        /**
         * POLYMORPHISM
         * **************************************************************************
         */
        // 1. Method Overriding (Runtime Polymorphism):

//        Mammal myMammal = new Mammal("Timon", 23);
//        Mammal myGoat = new Goat("Leo", 20, "Indian Goats");
//        Mammal myLion = new Lion("Simba", 30, "African Lions");
//
//        myMammal.makeSound();
//        myGoat.makeSound();
//        myLion.makeSound();
//
//        Mammal[] mammals = new Mammal[3];
//        mammals[0] = myMammal;
//        mammals[1] = myGoat;
//        mammals[2] = myLion;
//
//        for (Mammal mammal : mammals) {
//            mammal.makeSound();
//        }

        // 2.
//        Drawable myCircle = new Circle();
//        Drawable mySquare = new Square();
//        myCircle.draw();
//        mySquare.draw();
//
//        Drawable[] shapes = new Drawable[2];
//        shapes[0] = new Circle();
//        shapes[1] = new Square();
//
//        for (Drawable shape : shapes) {
//            shape.draw();
//        }
    }
}