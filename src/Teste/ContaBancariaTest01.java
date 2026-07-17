package Teste;

import Dominio.ContaBancaria;

public class ContaBancariaTest01 {
    static void main(String[] args) {
        ContaBancaria cc = new ContaBancaria(1997, "Pedro Henrique");

        // 1. Mostra a conta zerada
        cc.exibirExtrato();
        System.out.println("------------------"); // pula uma linha

        // 2. Faz um depósito e mostra o extrato atualizado
        cc.depositar(500.00);
        cc.exibirExtrato();
        System.out.println("----------------");

        // 3. Tenta sacar mais do que tem (vai dar o erro que programamos)
        cc.sacar(600.00);
        System.out.println("----------------");

        // 4. Faz um saque válido e vê o saldo diminuir
        cc.sacar(200.00);
        cc.exibirExtrato();
    }

}

