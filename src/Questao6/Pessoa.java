package Questao6;

public class Pessoa {
   private String nome;
   private int idade;
   private Endereco endereco; // AGORA está correto

   public Pessoa(String nome, int idade, Endereco endereco) {
       this.nome = nome;
       this.idade = idade;
       this.endereco = endereco;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public int getIdade() {
       return idade;
   }

   public void setIdade(int idade) {
       this.idade = idade;
   }

   public Endereco getEndereco() {
       return endereco;
   }

   public void setEndereco(Endereco endereco) {
       this.endereco = endereco;
   }

   @Override
   public String toString() {
       return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + '}';
   }
}
