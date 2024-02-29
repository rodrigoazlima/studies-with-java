package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory;

import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape.*;
import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color.*;

public class RedCircleFactory implements IAbstractFactory {
    @Override
    public IShape createShape() {
        return new Circle();
    }

    @Override
    public IColor createColor() {
        return new Red();
    }
}