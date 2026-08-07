package AssociaçãoDeClasses.Teste;

import AssociaçãoDeClasses.Dominio.Autor;
import AssociaçãoDeClasses.Dominio.Livro;

public class livroAutorTest {
    static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro");
        Livro livro = new Livro("Dom Casmurro", 256,autor);

        livro.imprime();

    }
}
