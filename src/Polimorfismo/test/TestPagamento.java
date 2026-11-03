package Polimorfismo.test;

import Polimorfismo.Pagamentos.*;

public class TestPagamento {
    static void main(String[] args) {
         Pix pix = new Pix();
         Pedido pedido1 = new Pedido(150, FormaPagamento.PIX, pix);
         pedido1.pagar();

         Cartao cartao = new Cartao();
         Pedido pedido2 = new Pedido(300, FormaPagamento.CARTAO, cartao);
         pedido2.pagar();

         Boleto boleto = new Boleto();
         Pedido pedido3 = new Pedido(500, FormaPagamento.BOLETO, boleto);
         pedido3.pagar();



    }
}
