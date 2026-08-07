package Herança02.Dominio;

import java.sql.SQLOutput;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;


    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void imprime() {
        System.out.println("    ## PROFESSOR ##" );
        super.imprime();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Salário: " + this.salario);
        System.out.println("--------------");
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
