package AssociaçãoDeClasses.Teste;

import AssociaçãoDeClasses.Dominio.Empresa;
import AssociaçãoDeClasses.Dominio.Funcionario;

public class empresaFuncionarioTest {
    static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro", 2500, "Estagiário Java");
        Funcionario f2 = new Funcionario("Beatriz", 8000, "Engenheira de Software");
        Funcionario f3 = new Funcionario("Lourival", 12000, "Desenvolvedor Senior");

        Funcionario[] funcionarios = {f1,f2,f3};

        Empresa empresa = new Empresa("Tech Solutions", funcionarios);

        empresa.imprime();

    }
}
