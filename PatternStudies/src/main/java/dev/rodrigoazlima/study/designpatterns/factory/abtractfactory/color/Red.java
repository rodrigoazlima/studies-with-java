package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color;

public class Red implements IColor {
    @Override
    public void fill() {
        System.out.println("Filling with Red color");
    }
}
