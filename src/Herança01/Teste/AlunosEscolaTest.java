package Herança01.Teste;

import Herança01.Dominio.Aluno;
import Herança01.Dominio.Escola;

public class AlunosEscolaTest {
    static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", 28, "12340", "ADS");
        Aluno a2 = new Aluno("Ana", 29, "56780","Marketing");
        Aluno a3 = new Aluno("Gabriel",13, "99990", "Inglês");
        Aluno[] alunos = {a1,a2,a3};

        Escola escola = new Escola("Escola Java", alunos);
        escola.imprime();
    }
}
