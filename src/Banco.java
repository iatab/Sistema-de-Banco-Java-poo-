import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Banco {

    String nome;
    String agencia;
    String endereco;
    String numero;
    ArrayList<Conta> contas = new ArrayList<Conta>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();


    public Banco(String nome, String agencia, String endereco, String numero) {
        this.nome = nome;
        this.agencia = agencia;
        this.endereco = endereco;
        this.numero = numero;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }



}
