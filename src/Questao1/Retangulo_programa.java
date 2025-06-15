package Questao1;
import java.util.Scanner;

public class Retangulo_programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Retangulo r1= new Retangulo();
        Retangulo r2= new Retangulo();
        
        System.out.println("Digite o valor da altura do primeiro retangulo: ");
        r1.altura= scanner.nextDouble();
        
        System.out.println("Digite o valor a largura do primeiro retangulo: ");
        r1.largura= scanner.nextDouble();
        
        System.out.println("Digite o valor da altura do segundo retangulo: ");
        r2.altura= scanner.nextDouble();
        
        System.out.println("Digite o valor a largura do segundo retangulo: ");
        r2.largura= scanner.nextDouble();
        
        System.out.println("O perimetro do retangulo 1 é: " +r1.calcularPerimetro());
        System.out.println("A area do retangulo 1 é: " +r1.calcularArea());
        
        System.out.println("O perimetro do retangulo 2 é: " +r2.calcularPerimetro());
        System.out.println("A area do retangulo 2 é: " +r2.calcularArea());
        
        
           }
    
}
