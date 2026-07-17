package Dominio;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10!");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2; // Só salva se estiver entre 0 e 10
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10!");
        }
    }

    public double calcularMedia() {

        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarStatus() {
        // Guardamos o retorno do método calcularMedia dentro de uma variável local
        double media = calcularMedia();

        if (media >= 7.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    public void exibirInfo() {
        System.out.println("--- FICHA DO ALUNO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);

        // Chamamos os métodos com retorno direto dentro do print!
        System.out.println("Média Final: " + calcularMedia());
        System.out.println("Status: " + verificarStatus());
    }
}