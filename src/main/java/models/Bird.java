package models;

import interfaces.IFlyable;
import interfaces.ISwimmable;

public class Bird implements IFlyable, ISwimmable {
    public String name;
    public String type;
    public String color;

    public void setName(String n) {
        this.name = n;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getName() {
        return this.name;
    }

    public void getString() {
        System.out.println("Name: " + this.name + " Type: " + this.type + " Color: " + this.color);
    }

    @Override
    public void fly(String type) {
        System.out.println("The "+type+" is flying...");
    }

    @Override
    public void swim() {
        System.out.println("Bird swimming (Some birds swim)...");
    }
}
