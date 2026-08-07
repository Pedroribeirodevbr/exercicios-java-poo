package Herança02.Dominio;

public class Livros {
    private Autor autor;
    private String titulo;
    private int paginas;

    public Livros(Autor autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void imprime() {
        System.out.println("Título: " + this.titulo);
        autor.imprime();
        System.out.println("Páginas: " + this.paginas);
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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
}
