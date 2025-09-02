public class Cartao {
    private String numero;
    private String senha;
    private String codigoSeguranca;


    public Cartao(String numero, String senha, String codigoSeguranca) {
        this.numero = numero;
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



    
}
