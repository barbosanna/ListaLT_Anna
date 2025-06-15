/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;
  import java.util.ArrayList;
/**
 *
 * @author anna_
 */
public class Usuario {

    protected String nome;
    protected int id;
    protected ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean podeEmprestar() {
        return true;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ") - Livros com ele: " + livrosEmprestados.size();
    }
}


