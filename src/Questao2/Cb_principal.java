
package Questao2;
import java.util.Scanner;
public class Cb_principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o nome do titular: ");
        conta.setTitular(scanner.nextLine());

        System.out.print("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.println("\n---- DADOS INICIAIS ----");
        conta.mostrarDados();

        System.out.print("\nValor para depósito: ");
        conta.depositar(scanner.nextDouble());

        System.out.print("Valor para saque: ");
        conta.sacar(scanner.nextDouble());

        System.out.println("\n---- DADOS ATUALIZADOS ----");
        conta.mostrarDados();

    }
}

   

       
       
       
    
    

