/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao9;


public class Principal {

    public static void main(String[] args) {
     
        Imprimivel p = new Produto("Notebook", 4500.00);
        Imprimivel f = new Funcionario("Anna", "Desenvolvedora");

        p.imprimir();
        f.imprimir();

        System.out.println();

        Documento r = new Relatorio("Relatório Financeiro");
        Documento c = new Carta("Carta para o cliente");

        r.abrir();
        c.abrir();
    }
}

    