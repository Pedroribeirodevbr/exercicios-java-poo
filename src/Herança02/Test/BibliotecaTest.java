package Herança02.Test;

import Herança02.Dominio.*;

public class BibliotecaTest {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", 13);
        Pessoa p2 = new Pessoa("Jacomo", 15);
        Aluno a1 = new Aluno("Pedro", 28, "ADS", 123400);
        Professor prof1 = new Professor("Manuela", 20, "Inglês", 20000);
        Autor autor1 = new Autor("GB", "Brasileiro");
        Livros l1 = new Livros(autor1, "Libertadores 2024", 250);
        Livros l2 = new Livros(autor1, "Botafogo campeão", 1000);
        Livros l3 = new Livros(autor1, "Brasileirão 2024", 500);

        Livros[] livros = {l1,l2,l3};
        Pessoa[] pessoas = {p1,p2};

        Biblioteca biblioteca = new Biblioteca(livros, pessoas);


      //  p1.imprime();
       // a1.imprime();
       // prof1.imprime();
        // autor1.imprime();
       // l1.imprime();

        biblioteca.imprime();

    }
}
