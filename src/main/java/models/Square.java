package models;

import interfaces.Drawable;

public class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
