package dev.rodrigoazlima.study.designpatterns.factory.person;

public class Professor extends Person {
    private String discipline;
    private Double salary;

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String getDescription() {
        return getName() + " (" + getAge() + "years) Professor of " + getDiscipline();
    }
}
