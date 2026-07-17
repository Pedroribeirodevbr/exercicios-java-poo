package Teste;

import Dominio.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro");

        // 1. Testando a trava de segurança (coloque uma nota absurda)
        a1.setNota1(15.0); // Vai printar a mensagem de erro!

        // 2. Colocando notas válidas
        a1.setNota1(8.5);
        a1.setNota2(6.5);

        // 3. O exibirInfo agora vai fazer todo o trabalho de chamar os outros métodos!
        a1.exibirInfo();
    }
}