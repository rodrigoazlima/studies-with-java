package dev.rodrigoazlima.study.designpatterns.factory.object;

public class ObjectFactory {

    public IObject createObject() {
        return new Ball();
    }

    public IObject createSquare() {
        return new Square();
    }

    public IObject createBall() {
        return new Ball();
    }

}
