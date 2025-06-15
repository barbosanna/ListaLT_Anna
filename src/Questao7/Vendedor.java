
package Questao7;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comissao;
    }
}


