package AssociaçãoDeClasses.Dominio;

public class Livro {
    private String titulo;
    private int paginas;
    private Autor autor;

    public Livro(String titulo, int paginas, Autor autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    public void imprime() {
        System.out.println("## Livro ##");
        System.out.println("Título: " + this.titulo);
        System.out.println("Páginas: " + this.paginas);
        System.out.println();
        autor.imprime();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
