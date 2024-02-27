package dev.rodrigoazlima.study.designpatterns.factory.object;

public class Square extends IObject {
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
