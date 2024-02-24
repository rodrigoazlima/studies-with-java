package dev.rodrigoazlima.study.designpatterns.factory.person;

public class PersonFactory {

    public Person createPerson() {
        return new Student();
    }

    public Person createProfessor() {
        return new Professor();
    }

    public Person createStudent() {
        return new Student();
    }

}
