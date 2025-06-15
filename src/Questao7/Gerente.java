
package Questao7;

public class Gerente extends Funcionario {
     
    private double bonus;

    public Gerente(String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}

