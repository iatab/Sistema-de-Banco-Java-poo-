public class Pagamentos {
    private int codigo;
    private String tipoPagamento;
    private double valor;


    public Pagamentos(int codigo, String tipoPagamento, double valor) {
        this.codigo = codigo;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
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
}
