import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Conta {
    private int numero;

    private double saldo;
    private ArrayList<Cartao> cartoes = new ArrayList<>();
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Pagamentos> pagamentos = new ArrayList<>();

    public Conta(int numero, double saldo, Pessoa pessoa) {
        this.numero = numero;
        this.saldo = saldo;
        this.pessoas.add(pessoa);
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

    public ArrayList<Pagamentos> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamentos> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    System.out.println("Titular" + pessoa.getNome() + " Adicionado com sucesso");

}

public void adicionarCartao(Cartao cartao){
        try{
            cartoes.add(cartao);
            System.out.println("cartao " + cartao.getNumero() + " adicionado com sucesso");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }



}

public String detalharConta() {
    // demosntrar os dados da conta como saldo, titulares, numero
    String texto = "";

    for (int i =0 ; i < pessoas.size() ; i++){

        texto += "Titular: " + pessoas.get(i).getNome() + " cpf: " + pessoas.get(i).getCpf() + "\n";

    }
    texto += "Saldo: " + getSaldo() + "\n";
    for (int i =0 ; i < cartoes.size() ; i++) {
        int n = i +1;
        texto += "Cartao n. "+ n +" da conta n.: " + cartoes.get(i).getNumero() + "\n";
    }




return texto;
}

public void detalharTitulares(){
        // demonstar os titulares.
    System.out.println("Lista de titulares");
    for (int i =0 ; i < pessoas.size() ; i++){
        System.out.println("Titular " +pessoas.get(i).getNome() + "cpf: " + pessoas.get(i).getCpf() );

    }


}
public void realizarPagamento(String tipo, double valor, Cartao cartao){
        // realiza pagamentos. verificando o saldo e apos isso criando o objeto pagamento e subtraindo o valor do saldo
    // selecionar o metodo de pagamento, utilizando o cartao cadastrado na conta
        this.saldo -= valor;
        Pagamentos pagamento1 = new Pagamentos(tipo,valor);
        pagamento1.setCartao(cartao);
    pagamento1.detalharPagamento();



}


    public void realizarPagamento(String tipo, double valor){

        this.saldo -= valor;
        Pagamentos pagamento1 = new Pagamentos(tipo,valor);
        pagamento1.detalharPagamento();



    }




}




