package dev.rodrigoazlima.study.designpatterns.factory.object;

public class Square implements IObject {
    private Double weigh;

    public void setWeigh(Double weigh) {
        this.weigh = weigh;
    }

    @Override
    public String getWeigh() {
        return String.valueOf(weigh);
    }

    @Override
    public String print() {
        return " Square with  " + getWeigh();
    }
}
