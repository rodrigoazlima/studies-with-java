package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color;

public class Blue implements IColor {
    @Override
    public void fill() {
        System.out.println("Filling with Blue color");
    }
}
