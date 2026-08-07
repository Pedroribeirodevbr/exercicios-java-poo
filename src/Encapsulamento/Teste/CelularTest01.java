package Encapsulamento.Teste;

import Encapsulamento.Dominio.Celular;

public class CelularTest01 {
    static void main(String[] args) {
        Celular c1 = new Celular("Apple", "iPhone 15", 256, 2800);
        c1.exibirInfo();
    }
}
