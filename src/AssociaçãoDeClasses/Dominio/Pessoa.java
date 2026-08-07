package AssociaçãoDeClasses.Dominio;

import java.sql.SQLOutput;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    {
        System.out.println("Dados pessoais:");
    }

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println();
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("CEP: " + endereco.getCep());
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
