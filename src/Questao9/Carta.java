/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao9;


public class Carta extends Documento {

    public Carta(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo carta: " + titulo);
    }
}


