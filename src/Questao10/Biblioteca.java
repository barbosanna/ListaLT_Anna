/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
    }

    public void emprestarLivro(String isbn, int usuarioId) {
        Livro livro = encontrarLivro(isbn);
        Usuario usuario = encontrarUsuario(usuarioId);

        if (livro != null && usuario != null) {
            if (!livro.isEmprestado() && usuario.podeEmprestar()) {
                livro.emprestar();
                usuario.adicionarLivro(livro);
                System.out.println("Livro emprestado com sucesso!");
            } else {
                System.out.println("Não foi possível emprestar o livro.");
            }
        } else {
            System.out.println("Livro ou usuário não encontrado.");
        }
    }

    public void devolverLivro(String isbn) {
        Livro livro = encontrarLivro(isbn);

        if (livro != null && livro.isEmprestado()) {
            for (Usuario u : usuarios) {
                if (u.livrosEmprestados.contains(livro)) {
                    u.removerLivro(livro);
                    break;
                }
            }
            livro.devolver();
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou não está emprestado.");
        }
    }

    private Livro encontrarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equalsIgnoreCase(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario encontrarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
