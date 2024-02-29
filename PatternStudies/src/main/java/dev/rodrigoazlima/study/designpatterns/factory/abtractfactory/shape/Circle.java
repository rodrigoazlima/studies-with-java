package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape;


public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
