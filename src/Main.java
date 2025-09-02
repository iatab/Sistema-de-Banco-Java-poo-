import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("bb","452","ingleses");

        Pessoa pessoa1 = new Pessoa("alfredo",25,"m","145885547","ingleses");
        Pessoa pessoa2 = new Pessoa("carlos",25,"m","3453453","canasvieiras");
        Conta conta1 = new Conta(5003,1000,pessoa1);
        banco1.addConta(conta1);
        System.out.println("----------------------------------");
        conta1.addPessoa(pessoa2);
        System.out.println("----------------------------------");
        Cartao cartao1 = new Cartao("123","234");
        conta1.adicionarCartao(cartao1);
        System.out.println("----------------------------------");
        conta1.realizarPagamento("dinheiro",100);
        System.out.println("----------------------------------");
        System.out.println(conta1.detalharConta());
        System.out.println("----------------------------------");

        conta1.realizarPagamento("cartao",100,conta1.getCartoes().get(0));

        System.out.println("----------------------------------");








    }
}