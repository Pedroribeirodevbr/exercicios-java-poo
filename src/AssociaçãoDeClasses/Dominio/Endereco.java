package AssociaçãoDeClasses.Dominio;

public class Endereco {
    private String rua;
    private String cidade;
    private String cep;


    public Endereco(String rua, String cidade, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    public void imprime() {
        System.out.println("Rua: " + this.rua);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Cep: " + this.cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
