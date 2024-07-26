package Aula2_Abstratas;

public class Assalariado extends Empregado {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }
}
