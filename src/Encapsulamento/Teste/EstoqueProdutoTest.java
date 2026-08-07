package Encapsulamento.Teste;

import Encapsulamento.Dominio.EstoqueProduto;

public class EstoqueProdutoTest {
    static void main(String[] args) {
        EstoqueProduto prod = new EstoqueProduto("Carregador", 15, 10);
        prod.exibirEstoq();
        System.out.println("--------------");
        System.out.println();

        prod.adicionarEstoque(10);
        System.out.println();
        prod.exibirEstoq();
        System.out.println("---------------");
        System.out.println();

        prod.vender(3);
        System.out.println();
        prod.exibirEstoq();
        System.out.println();
        System.out.println("----------");
        System.out.println();

        prod.vender(30);
    }
}
