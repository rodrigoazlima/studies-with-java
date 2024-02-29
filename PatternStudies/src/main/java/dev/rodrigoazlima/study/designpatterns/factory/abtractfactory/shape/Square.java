package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
