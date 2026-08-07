package AssociaçãoDeClasses.Teste;

import AssociaçãoDeClasses.Dominio.Endereco;
import AssociaçãoDeClasses.Dominio.Pessoa;

public class pessoaEnderecoTest {
    static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A", "RJ", "12345-67");
        Pessoa p1 = new Pessoa("Pedro", 28, e1);

        p1.imprime();

    }
}
