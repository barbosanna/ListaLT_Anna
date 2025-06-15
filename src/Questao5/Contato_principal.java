
package Questao5;
import java.util.HashSet;
public class Contato_principal {

    public static void main(String[] args) {
       
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Anna", "anna@email.com", "1111-1111");
        Contato c2 = new Contato("Ana Clara", "anna@email.com", "2222-2222");
        Contato c3 = new Contato("Carlos", "carlos@email.com", "3333-3333");

        contatos.add(c1);
        contatos.add(c2); 
        contatos.add(c3);

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}

  
