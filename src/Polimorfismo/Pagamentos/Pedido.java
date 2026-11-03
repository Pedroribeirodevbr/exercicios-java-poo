package Polimorfismo.Pagamentos;

public class Pedido {
    private double valor;
    private FormaPagamento formaPagamento;
    private Pagamento pagamento;

    public Pedido(double valor, FormaPagamento formaPagamento, Pagamento pagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.pagamento = pagamento;
    }

    public void pagar(){
        pagamento.pagar(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
