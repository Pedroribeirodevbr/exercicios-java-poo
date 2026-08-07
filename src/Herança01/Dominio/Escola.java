package Herança01.Dominio;

public class Escola {
    private String nome;
    private Aluno[] alunos;

    public Escola(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Escola: " + this.nome);
        for (Aluno aluno : alunos) {
            aluno.imprime();
            System.out.println();
            System.out.println("------------------");
            System.out.println();
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
