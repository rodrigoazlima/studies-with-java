package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory;

import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color.IColor;
import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape.IShape;

public class RunExample {
    public static void main(String[] args) {
        IAbstractFactory circleRedFactory = new RedCircleFactory();
        IShape circle = circleRedFactory.createShape();
        IColor red = circleRedFactory.createColor();

        circle.draw();
        red.fill();
    }
}
