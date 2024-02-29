package dev.rodrigoazlima.study.designpatterns.factory.abtractfactory;

import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.color.IColor;
import dev.rodrigoazlima.study.designpatterns.factory.abtractfactory.shape.IShape;

public interface IAbstractFactory {
    IShape createShape();

    IColor createColor();
}
