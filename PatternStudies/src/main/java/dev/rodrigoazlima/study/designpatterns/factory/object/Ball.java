package dev.rodrigoazlima.study.designpatterns.factory.object;

public class Ball extends IObject {
    private String cpf;
    private Double tuitionPrice;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getTuitionPrice() {
        return tuitionPrice;
    }

    public void setTuitionPrice(Double tuitionPrice) {
        this.tuitionPrice = tuitionPrice;
    }

    @Override
    public String getDescription() {
        return getName() + " (" + getAge() + "years) Student with CPF " + getCpf();
    }
}
