import java.util.ArrayList;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private ArrayList<Cartao> cartoes = new ArrayList<>();
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Conta(int numero, double saldo, ArrayList<Pessoa> pessoas) {
        this.numero = numero;
        this.saldo = saldo;
        this.pessoas = pessoas;
    }


    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(ArrayList<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

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
}
