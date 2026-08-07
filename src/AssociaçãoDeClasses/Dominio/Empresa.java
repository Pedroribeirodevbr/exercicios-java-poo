package AssociaçãoDeClasses.Dominio;

public class Empresa {
    private Funcionario[] funcionarios;
    private String nome;

    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }
    public void imprime(){
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprime();
            
        }

    }
}
