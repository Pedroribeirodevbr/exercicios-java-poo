package AssociaçãoDeClasses.Teste;

import AssociaçãoDeClasses.Dominio.Aluno;
import AssociaçãoDeClasses.Dominio.Curso;

public class AlunoCursoTest {
    static void main(String[] args) {
        Curso c1 = new Curso("Marketing digital", 200);
        Aluno a1 = new Aluno("Pedro", 28, c1);

        a1.imprime();

    }
}
