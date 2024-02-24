package dev.rodrigoazlima.study.designpatterns.factory.person;

public abstract class Person {
    private String name;
    private String age;

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
