/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao10;

/**
 *
 * @author anna_
 */public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros com códigos numéricos
        biblioteca.adicionarLivro(new Livro("Suicidas", "Raphael Montes", "1"));
        biblioteca.adicionarLivro(new Livro("Dias Perfeitos", "Raphael Montes", "2"));
        biblioteca.adicionarLivro(new Livro("It: A Coisa", "Stephen King", "3"));
        biblioteca.adicionarLivro(new Livro("O Iluminado", "Stephen King", "4"));

        // Adicionando usuários
        biblioteca.adicionarUsuario(new UsuarioComum("João", 1));
        biblioteca.adicionarUsuario(new UsuarioPremium("Maria", 2));

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Empréstimos
        biblioteca.emprestarLivro("1", 1); // João pega "Suicidas"
        biblioteca.emprestarLivro("3", 2); // Maria pega "It"

        // Devolução
        biblioteca.devolverLivro("1"); // João devolve

        // Listar novamente
        biblioteca.listarLivrosDisponiveis();
    }
}
