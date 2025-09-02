import java.util.Random;

public class Pagamentos {
    private int codigo;
    private String tipoPagamento;
    private double valor;
    private Cartao cartao;



    public Pagamentos(String tipoPagamento, double valor) {
        Random random = new Random();
        this.codigo = random.nextInt();
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void detalharPagamento(){
        System.out.println("pagamento n. " + getCodigo() + " com valor de: " +getValor()+ " metodo de pagamento utilizado " + getTipoPagamento());

        if (cartao != null) {

            System.out.println("Transaçao realizada com o Cartao n.: "  + cartao.getNumero() );

        }
    }
}
