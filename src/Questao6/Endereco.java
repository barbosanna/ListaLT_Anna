
package Questao6;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String cep;
    
    public Endereco(String rua, int numero, String cidade, String cep){
        this.rua= rua;
        this.numero= numero;
        this.cidade= cidade;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + ", cep=" + cep + '}';
    }
}
