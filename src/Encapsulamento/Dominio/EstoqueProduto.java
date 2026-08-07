package Encapsulamento.Dominio;

public class EstoqueProduto {
    private String nome;
    private double preco;
    private int quantidade;

    public EstoqueProduto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            this.quantidade = this.quantidade + quantidade;
            System.out.println("Estoque adicionado +" +quantidade + " unidade(s)");
        }
    }
    public void vender(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Quantidade de produtos vendidos: " + quantidade + " unidade(s)");
        }else {
            System.out.println("Quantidade indisponíivel");

        }
    }
    public void exibirEstoq (){
        System.out.println("Quantidade em estoque");
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Estoque Atual: " + this.quantidade);

    }

}
