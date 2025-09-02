import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Banco {

    String nome;
    String agencia;
    String endereco;

    ArrayList<Conta> contas = new ArrayList<Conta>();



    public Banco(String nome, String agencia, String endereco) {
        this.nome = nome;
        this.agencia = agencia;
        this.endereco = endereco;



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


    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }


    public void addConta(Conta conta) {
        this.contas.add(conta);
        System.out.println("Conta: " + conta.getNumero() + " adicionada com sucesso");
    }

    public void detalharBanco(){

        // detalhar as contas existente, quantidade, nome banco, numero agencia

    }



}
