
package Questao6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        
        String rua = scanner.nextLine();
        int numero = scanner.nextInt();
        scanner.nextLine();
        String cidade = scanner.nextLine();
        String cep = scanner.nextLine();

        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        System.out.println();
        System.out.println(pessoa);

        scanner.close();
    }
}
    
