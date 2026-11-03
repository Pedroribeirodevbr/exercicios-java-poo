package Polimorfismo.Pagamentos;

public class Cartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" +valor + " realizado via Cartão.");
    }
}
