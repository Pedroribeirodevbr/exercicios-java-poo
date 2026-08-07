package Herança02.Dominio;

public class Aluno extends Pessoa {
    private String curso;
    private int matricula;

    public Aluno(String nome, int idade, String curso, int matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void imprime() {
        System.out.println("     ##  ALUNO ##");
        super.imprime();
        System.out.println("Curso: " + this.curso);
        System.out.println("Nº Matrícula: " + this.matricula);
        System.out.println("--------------");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
