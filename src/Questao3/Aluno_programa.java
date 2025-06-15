
package Questao3;

public class Aluno_programa {

    public static void main(String[] args) {
        Aluno a1= new Aluno();
        Aluno a2= new Aluno("Anna", "20211ireinfint0004", "info");
        
        System.out.println("Aluno 1: ");
        a1.dados();
        
        System.out.println("Aluno 2: ");
        a2.dados();
    }
    
}
