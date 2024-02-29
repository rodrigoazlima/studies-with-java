package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory;

import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color.Blue;
import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color.IColor;
import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape.IShape;
import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape.Square;

public class BlueCircleFactory implements IAbstractFactory {
    @Override
    public IShape createShape() {
        return new Square();
    }

    @Override
    public IColor createColor() {
        return new Blue();
    }
}
