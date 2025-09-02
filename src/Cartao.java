import java.util.Random;

public class Cartao {
    private String numero;
    private String senha;
    private String codigoSeguranca;


    public Cartao(String senha, String codigoSeguranca) {

        this.numero = String.valueOf(gerarNumero());
        this.senha = senha;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public StringBuilder gerarNumero(){
        Random random = new Random();
        StringBuilder numeroCartao = new StringBuilder();
        for (int i= 0 ; i<16 ; i++){

            int digitoNumero = random.nextInt(10);
            numeroCartao.append(digitoNumero);

        }
        return numeroCartao;

    }


    
}
