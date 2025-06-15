
package Questao7;
import java.util.ArrayList;
public class Princi {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Lucas", "111.111.111-11", 2000));
        funcionarios.add(new Gerente("Anna", "222.222.222-22", 3000, 1000));
        funcionarios.add(new Vendedor("Carlos", "333.333.333-33", 1800, 500));

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}