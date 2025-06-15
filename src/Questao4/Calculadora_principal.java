
package Questao4;
 import java.util.Scanner;
public class Calculadora_principal {


    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

       
        System.out.print("Digite o primeiro inteiro: ");
        int int1 = scanner.nextInt();

        System.out.print("Digite o segundo inteiro: ");
        int int2 = scanner.nextInt();

        int resultadoInt = calc.somar(int1, int2);
        System.out.println("O resultado é: " + resultadoInt);
        System.out.println();

        System.out.print("Digite o primeiro número decimal: ");
        double double1 = scanner.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        double double2 = scanner.nextDouble();

        double resultadoDouble = calc.somar(double1, double2);
        System.out.println("O resultado é: " + resultadoDouble);
        System.out.println();

        System.out.print("Quantos números deseja somar? ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int resultadoArray = calc.somar(numeros);
        System.out.println("O resultado é:" + resultadoArray);

        scanner.close();
    }
}

    
    

