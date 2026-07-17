package Teste;

import Dominio.Treino;

public class treinoTest {
    static void main(String[] args) {
        Treino t1 = new Treino("Jiu Jitsu", 8.5);
        t1.registrarTempo(45);
       // t1.registrarTempo(15);
        t1.exibirResumoTreino();
        System.out.println();
        System.out.println("-----------------");
        System.out.println();

        Treino t2 = new Treino("Calistenia", 7);
        t2.registrarTempo(20);
         t2.exibirResumoTreino();
    }
}
