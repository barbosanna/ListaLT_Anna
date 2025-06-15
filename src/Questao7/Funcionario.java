
package Questao7;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome, String cpf, double salario){
        this.cpf= cpf;
        this.nome= nome;
        this.salario= salario;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double calcularSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
}
