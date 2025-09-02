import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("alfredo",25,"m","145885547","ingleses");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        Conta conta1 = new Conta(5003,10,pessoas);
    Banco banco1 = new Banco("bb","452","ingleses","245");
    banco1.addConta(conta1);
    }
}