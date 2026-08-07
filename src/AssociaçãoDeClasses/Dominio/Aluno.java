package AssociaçãoDeClasses.Dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Curso curso;

    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    public void imprime() {
        System.out.println("Aluno: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Matriculado em: "+ curso.getNomeCurso());
        System.out.println("Carga Horária de: "+ curso.getCargaHoraria() + " Horas");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
