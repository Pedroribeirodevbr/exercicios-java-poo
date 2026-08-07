package Herança02.Dominio;

public class Biblioteca {
    Livros[] livros;
    Pessoa[] pessoas;

    public Biblioteca(Livros[] livros, Pessoa[] pessoas) {
        this.livros = livros;
        this.pessoas = pessoas;
    }

    public void imprime() {
        System.out.println("Biblioteca Central");
        System.out.println("    ## LIVROS ##");
        for (Livros livro : livros) {
            livro.imprime();
            System.out.println();
            System.out.println("-------------");
            
        }
        System.out.println();

        System.out.println("    ## PESSOAS ##");
        for (Pessoa pessoa : pessoas) {

            pessoa.imprime();
            System.out.println();
            System.out.println("-------------");
            
        }


    }

    public Livros[] getLivros() {
        return livros;
    }

    public void setLivros(Livros[] livros) {
        this.livros = livros;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
}
