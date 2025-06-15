
package Questao2;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
            saldo += valor;
    }
    
    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            
        } else {
            System.out.println("Saldo insuficiente.");
        }
}
 
public void mostrarDados(){
    System.out.println("Numero: " +numero) ;
     System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

}